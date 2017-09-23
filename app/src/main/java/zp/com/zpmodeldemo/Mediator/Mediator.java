package zp.com.zpmodeldemo.Mediator;

/**
 * 具体中介者类
 */

public class Mediator extends AbstractMediator{

    @Override
    public void execute(String name, String method) {
        if("self".equals(method)){
            // 各自做好分内事
            if("ColleagueA".equals(name)) {
                AColleague colleague = (AColleague)super.colleagues.get("ColleagueA");
                colleague.self();
            }else {
                BColleague colleague = (BColleague)super.colleagues.get("ColleagueB");
                colleague.self();
            }
        }else {
            // 与其他同事合作
            if("ColleagueA".equals(name)) {
                AColleague colleague = (AColleague)super.colleagues.get("ColleagueA");
                colleague.out();
            }else {
                BColleague colleague = (BColleague)super.colleagues.get("ColleagueB");
                colleague.out();
            }
        }
    }
}
