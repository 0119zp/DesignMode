package zp.com.zpmodeldemo.Command;

/**
 * 修改需求命令
 */

public class ChangCommand extends Command{

    @Override
    void execute() {
        xuqiuGroup.chang();
        meigongGroup.chang();
        codeGroup.chang();
    }
}
