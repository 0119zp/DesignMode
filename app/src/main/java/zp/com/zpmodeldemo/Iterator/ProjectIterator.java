package zp.com.zpmodeldemo.Iterator;

import java.util.ArrayList;

/**
 * 定义一个迭代器
 */

public class ProjectIterator implements IProjectIterator{
    // 项目集合
    private ArrayList<IProject> projectList = new ArrayList<>();
    // 当前条目
    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> list) {
        this.projectList = list;
    }

    @Override
    public boolean hasNext() {
        boolean hasNext = true;
        if (currentItem >= projectList.size() || projectList.get(currentItem) == null){
            hasNext = false;
        }
        return hasNext;
    }

    @Override
    public IProject next() {
        return projectList.get(currentItem++ );
    }

    @Override
    public void remove() {
        // 待开发
    }
}
