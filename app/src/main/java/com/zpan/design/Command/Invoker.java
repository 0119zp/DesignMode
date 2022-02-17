package com.zpan.design.Command;

/**
 * 接收命令者，并执行
 */

public class Invoker {

    private Command command;
    // 设置命令
    public Invoker(Command command){
        this.command = command;
    }

    // 执行命令
    public void setExecute(){
        command.execute();
    }

}
