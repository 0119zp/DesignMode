package com.zpan.design;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Random;
import com.zpan.design.AbstractFactory.MyFactory;
import com.zpan.design.AbstractFactory.ZpFactory01;
import com.zpan.design.AbstractFactory.ZpFactory02;
import com.zpan.design.Adapter.Adaptee;
import com.zpan.design.Adapter.Adapter;
import com.zpan.design.Adapter.MyAdapter;
import com.zpan.design.Bridge.HouseCorp;
import com.zpan.design.Bridge.HouseProduct;
import com.zpan.design.Bridge.IpadCorp;
import com.zpan.design.Bridge.IpadProduct;
import com.zpan.design.Builder.Director;
import com.zpan.design.Builder.Person;
import com.zpan.design.Builder.PersonBuilder;
import com.zpan.design.ChainOfReponsibility.Father;
import com.zpan.design.ChainOfReponsibility.Husband;
import com.zpan.design.ChainOfReponsibility.IWomen;
import com.zpan.design.ChainOfReponsibility.Son;
import com.zpan.design.ChainOfReponsibility.Women;
import com.zpan.design.Command.AddCommand;
import com.zpan.design.Command.ChangCommand;
import com.zpan.design.Command.DeleteCommand;
import com.zpan.design.Command.Invoker;
import com.zpan.design.Composite.Company;
import com.zpan.design.Composite.ConcreteCompany;
import com.zpan.design.Composite.FinanceDepartment;
import com.zpan.design.Decorator.HighScorDecorator;
import com.zpan.design.Decorator.MySchoolReport;
import com.zpan.design.Decorator.SchoolReport;
import com.zpan.design.Decorator.SortDecorator;
import com.zpan.design.Facade.IFacade;
import com.zpan.design.FactoryMethod.AddFactory;
import com.zpan.design.FactoryMethod.IFactory;
import com.zpan.design.Iterator.IProject;
import com.zpan.design.Iterator.IProjectIterator;
import com.zpan.design.Iterator.Project;
import com.zpan.design.Mediator.AColleague;
import com.zpan.design.Mediator.AbstractMediator;
import com.zpan.design.Mediator.BColleague;
import com.zpan.design.Mediator.Mediator;
import com.zpan.design.Observer.HanFeiZi;
import com.zpan.design.Observer.LiSi;
import com.zpan.design.Observer.LiuSi;
import com.zpan.design.Propotype.Student;
import com.zpan.design.Proxy.MyHouse;
import com.zpan.design.Proxy.ProxyHouse;
import com.zpan.design.SimpleFactory.Operation;
import com.zpan.design.SimpleFactory.OperationFactory;
import com.zpan.design.State.IContext;
import com.zpan.design.State.OpeningState;
import com.zpan.design.Strategy.AStrategy;
import com.zpan.design.Strategy.BStrategy;
import com.zpan.design.Strategy.CStrategy;
import com.zpan.design.Strategy.ZpContext;
import com.zpan.design.TemplateMethod.ACar;
import com.zpan.design.TemplateMethod.BCar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 装饰模式
    public void button1(View view){
        // 成绩单
        SchoolReport sr;
        // 原成绩单
        sr = new MySchoolReport();
        // 封装最高成绩
        sr = new HighScorDecorator(sr);
        // 封装排名
        sr = new SortDecorator(sr);
        // 看成绩单
        sr.report();
        // 签名
        sr.sign("张三");
    }

    // 观察者模式
    public void button2(View view){
        HanFeiZi hanFeiZi = new HanFeiZi();

        LiSi liSi  = new LiSi();
        LiuSi liuSi = new LiuSi();

        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(liuSi);

        hanFeiZi.fun();
        Log.e("zhang","=============111111============");
        hanFeiZi.cry();

    }

    // 桥梁模式
    public void button3(View view){

        HouseCorp houseCorp = new HouseCorp(new HouseProduct());
        houseCorp.makeMoney();

        LogUtils.getELog("////////////////////////////");

        IpadCorp ipadCorp = new IpadCorp(new IpadProduct());
        ipadCorp.makeMoney();
    }

    // 简单工厂模式
    public void button4(View view){
        Operation op = OperationFactory.CreatOperation("+");
        op.setNumA(4);
        op.setNumB(3);

        LogUtils.getELog(""+op.getResult());
    }

    // 工厂方法模式
    public void button5(View view){
        IFactory factory = new AddFactory();
        Operation operation = factory.creatOperation();

        operation.setNumA(5);
        operation.setNumB(9);

        LogUtils.getELog(""+operation.getResult());

    }

    // 抽象工厂模式
    public void button6(View view){

        MyFactory myFactory01 = new ZpFactory01();
        myFactory01.FactoryA().methodA1();
        myFactory01.FactoryA().methodA2();
        myFactory01.FactoryB().methodB1();
        myFactory01.FactoryB().methodB2();

        MyFactory myFactory02 = new ZpFactory02();
        myFactory02.FactoryA().methodA1();
        myFactory02.FactoryA().methodA2();
        myFactory02.FactoryB().methodB1();
        myFactory02.FactoryB().methodB2();
    }

    // 建造者模式 -- 实例应用：dialog
    public void button7(View view){

        PersonBuilder builder = new PersonBuilder();
        Director director = new Director(builder);
        director.construct("zhangpan","25","河南","学号：23545");
        Person person = builder.creat();

        Log.e("zhang","=====" + person.toString());
    }

    // 策略模式 -- 实例应用：listview 的setAdapter（）
    public void button8(View view){
        // 策略一
        AStrategy aStrategy = new AStrategy();
        ZpContext zpContextA = new ZpContext(aStrategy);
        zpContextA.setOperate();
        // 策略二
        BStrategy bStrategy = new BStrategy();
        ZpContext zpContextB = new ZpContext(bStrategy);
        zpContextB.setOperate();
        // 策略三
        CStrategy cStrategy = new CStrategy();
        ZpContext zpContextC = new ZpContext(cStrategy);
        zpContextC.setOperate();
    }

    // 代理模式 -- 当无法或者不想直接访问某个对象或者是访问某个对象存在困难时
    public void button9(View view){

        MyHouse myHouse = new MyHouse();
        ProxyHouse proxyHouse = new ProxyHouse(myHouse);
        proxyHouse.sellHouse();
    }

    // 门面模式
    public void button10(View view){

        IFacade iFacade = new IFacade();
        iFacade.test();
    }

    // 适配器模式
    public void button11(View view){
        // 类适配器
        Adapter adapter = new Adapter();
        adapter.sampleOperationB();
        // 对象适配器
        MyAdapter myAdapter = new MyAdapter(new Adaptee());
        myAdapter.sampleOperationB();
    }

    // 模板方法模式
    public void button12(View view){
        ACar aCar = new ACar();
        aCar.setBoom(true);
        aCar.run();

        BCar bCar = new BCar();
        bCar.setBoom(false);
        bCar.run();
    }

    // 命令模式
    public void button13(View view){
        // 增加需求
        Invoker invoker1 = new Invoker(new AddCommand());
        invoker1.setExecute();

        // 删除需求
        Invoker invoker2 = new Invoker(new DeleteCommand());
        invoker2.setExecute();

        // 修改需求
        Invoker invoker3 = new Invoker(new ChangCommand());
        invoker3.setExecute();
    }

    // 迭代器模式
    public void button14(View view){
        IProject project = new Project();

        for (int i = 1 ; i < 10 ; i ++){
            project.addProject("第 " + i + " 个项目","项目经费 "+ i * 100);
        }

        // 迭代器应用
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()){
            IProject iProject = (IProject) projectIterator.next();
            LogUtils.getELog(iProject.getProjectInfo());
        }
    }

    // 组合模式 -- 整体-部分模式
    public void button15(View view){

        Company root = new ConcreteCompany("屹通公司");
        root.add(new FinanceDepartment("屹通财务部"));
        root.add(new FinanceDepartment("zhang财务部"));

        root.display(0);
    }

    // 责任链模式
    public void button16(View view){

        Random random = new Random();
        ArrayList<IWomen> list = new ArrayList<>();
        for (int i = 0 ; i < 5 ; i++){
            list.add(new Women(random.nextInt(4),"我要出去逛街"));
        }

        Father father = new Father(1);
        Husband husband = new Husband(2);
        Son son = new Son(3);

        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women:list){
            father.handlerMessage(women);
        }

    }

    // 访问者模式
    public void button17(View view){}

    // 状态模式
    public void button18(View view){

        IContext iContext = new IContext();
        iContext.setLiftState(new OpeningState());
//        iContext.setLiftState(new ClosingState());
//        iContext.setLiftState(new RunningState());
//        iContext.setLiftState(new StopingState());

        iContext.open();
        iContext.close();
        iContext.run();
        iContext.stop();
    }

    // 原型模式
    public void button19(View view){
        Student stu1,stu2,stu3;

        stu1 = new Student();
        stu1.setName("zhang");
        stu1.setOld("20");
        stu1.setSex("男");

        LogUtils.getELog("姓名："+stu1.getName()+" 年龄："+stu1.getOld()+" 性别："+stu1.getSex());

        // 使用原型
        stu2 = stu1.clone();
        stu2.setName("wang");
        stu2.setOld("17");

        LogUtils.getELog("姓名："+stu2.getName()+" 年龄："+stu2.getOld()+" 性别："+stu2.getSex());
        // 使用原型
        stu3 = stu1.clone();
        stu3.setName("li");
        stu3.setSex("女");

        LogUtils.getELog("姓名："+stu3.getName()+" 年龄："+stu3.getOld()+" 性别："+stu3.getSex());
    }

    // 中介者模式
    public void button20(View view){
        //创建一个中介者
        AbstractMediator mediator = new Mediator();

        //创建两个同事
        AColleague colleagueA = new AColleague(mediator);
        BColleague colleagueB = new BColleague(mediator);

        //中介者分别与每个同事建立联系
        mediator.addColleague("ColleagueA", colleagueA);
        mediator.addColleague("ColleagueB", colleagueB);

        //同事们开始工作
        colleagueA.self();
        colleagueA.out();

        LogUtils.getELog("合作愉快，任务完成！");

        colleagueB.self();
        colleagueB.out();
        LogUtils.getELog("合作愉快，任务完成！");
    }

    // 解释器模式
    public void button21(View view){}

    // 亨元模式
    public void button22(View view){}

    // 备忘录模式
    public void button23(View view){}


}
