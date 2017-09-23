package zp.com.zpmodeldemo.Command;

/**
 * 删除需求命令
 */

public class DeleteCommand extends Command{
    // 删除命令
    @Override
    void execute() {
        xuqiuGroup.delete();
        meigongGroup.delete();
        codeGroup.delete();
    }
}
