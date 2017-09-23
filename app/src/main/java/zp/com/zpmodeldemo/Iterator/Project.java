package zp.com.zpmodeldemo.Iterator;

import java.util.ArrayList;

/**
 * 所有项目的信息类
 */

public class Project implements IProject{

    // 所有项目集合
    private ArrayList<IProject> list = new ArrayList<>();

    private String name;    // 项目名称
    private String money;   // 项目经费

    public Project(){}

    public Project(String name, String money){
        this.name = name;
        this.money = money;
    }

    @Override
    public void addProject(String name, String money) {
        this.list.add(new Project(name,money));
    }

    @Override
    public String getProjectInfo() {

        String info = "";
        info = info + "项目名称 = " + name;
        info = info + "\t项目经费 = " + money;

        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(list);
    }
}
