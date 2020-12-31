package indi.zsr.test.hashtab;

import java.lang.annotation.Retention;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 哈希表测试类
 */
public class HashTabDemo {
    public static void main(String[] args) {
        //创建一个哈希表
        HashTab hashTab = new HashTab(7);

        //写一个简单的菜单
        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("add:  添加雇员");
            System.out.println("list: 显示雇员");
            System.out.println("find: 显示雇员");
            System.out.println("del:  删除雇员");
            System.out.println("exit: 退出程序");
            key = scanner.next();
            switch (key) {

                case "add":
                    System.out.println("请输入id:");
                    int id = scanner.nextInt();
                    System.out.println("请输入名字:");
                    String name = scanner.next();
                    Emp emp = new Emp(id, name);
                    hashTab.add(emp);
                    break;
                case "list":
                    hashTab.list();
                    break;
                case "find":
                    System.out.println("请输入雇员id");
                    int findId = scanner.nextInt();
                    hashTab.findEmpById(findId);
                    break;
                case "del":
                    System.out.println("请输入雇员id");
                    int delId = scanner.nextInt();
                    boolean isSuccess = hashTab.delEmpById(delId);
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}

/**
 * 创建HashTab 管理多条链表
 */
class HashTab {
    private EmpLinkedList[] empLinkedListArray;
    private int size;//表示有多少条链表

    //构造器
    public HashTab(int size) {
        this.size = size;
        //初始化empLinkedList[];
        this.empLinkedListArray = new EmpLinkedList[this.size];
        //？留一个坑
        //数组中的链表没初始化
        //填充链表对象实例 不能用这个函数 会指向同一个地址 Arrays.fill(this.empLinkedListArray,new EmpLinkedList());
        for (int i = 0; i < size; i++) {
            this.empLinkedListArray[i] = new EmpLinkedList();
        }

    }

    //添加雇员
    public void add(Emp emp) {
        //根据员工的id,得到该员工应当添加到哪条链表
        int empLinkedListNo = hashFun(emp.id);
        System.out.println(empLinkedListNo);
        //将emp添加到对应的链表中
        //没初始化会报空指针异常
        empLinkedListArray[empLinkedListNo].add(emp);
    }

    //遍历所有的链表
    public void list() {
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i].list(i);
        }
    }

    //编写是散列函数,使用一个简单的取模法
    public int hashFun(int id) {
        return id % size;
    }

    /**
     * 根据id查找雇员
     *
     * @param id 雇员id
     */
    public void findEmpById(int id) {
        //使用散列函数确定到哪个链表查找
        int empLinkedListNo = hashFun(id);
        Emp emp = empLinkedListArray[empLinkedListNo].findEmpById(id);
        if (emp != null) {
            System.out.printf("在第%d条链表上找到该雇员 name=%s\n", empLinkedListNo + 1, emp.name);
        } else {
            System.out.println("没有找到该雇员");
        }
    }

    public boolean delEmpById(int id) {
        int empLinkedListNo = hashFun(id);
        return empLinkedListArray[empLinkedListNo].delEmpById(id);
    }
}

/**
 * 表示一个雇员
 */
class Emp {
    public int id;
    public String name;
    public Emp next;//next 默认为null

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

/**
 * 链表 存放多个雇员
 */
class EmpLinkedList {
    //头指针，指向第一个Emp，因此我们这个链表的head 是直接指向第一个Emp
    private Emp head;//默认为空

    /**
     * 添加员工到链表
     * 1.假定 当添加雇员时，id时自增长，即id的分配总是从小到大的
     * 因此我们将该雇员直接加入本链表的最后即可
     *
     * @param emp 员工
     */
    public void add(Emp emp) {
        //如果是添加第一个雇员
        if (head == null) {
            head = emp;
            return;
        }
        //如果不是第一个雇员，则使用一个辅助的指针，帮助定位到最后
        Emp curEmp = head;
        while (curEmp.next != null) {

            curEmp = curEmp.next;//后移 找最后一个为空的
        }
        //退出时直接将emp 加入链表
        curEmp.next = emp;

    }

    /**
     * 遍历链表
     *
     * @param no 下标
     */
    public void list(int no) {
        if (head == null) {
            System.out.println("第 " + (no + 1) + " 当前链表为空");
            return;
        }
        System.out.print("第 " + (no + 1) + " 链表信息为");
        Emp curEmp = head;//辅助指针
        while (true) {
            System.out.printf("  => id= %d name= %s\t", curEmp.id, curEmp.name);
//            System.out.print("=> id= "+curEmp.id+" name= "+curEmp.name);
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
        System.out.println();
    }

    /**
     * 根据id查找雇员
     *
     * @param id 雇员id
     * @return 雇员实体
     */
    public Emp findEmpById(int id) {
        //判断链表是否为空
        if (head == null) {
            System.out.println("链表为空");
            return null;
        }
        //辅助指针
        Emp curEmp = head;
        while (true) {
            if (curEmp.id == id) {//找到
                break;//这时候curMap指向了查找的雇员
            }
            //退出
            if (curEmp.next == null) {//说明后遍历当前链表没有找到该雇员
                curEmp = null;
                break;
            }
            curEmp = curEmp.next;
        }
        return curEmp;
    }

    /**
     * 根据id 输出链表中的雇员实体
     * @param id 雇员id
     * @return true为删除成功 false 为删除失败
     */
    public boolean delEmpById(int id) {
        //判断链表是否为空
        if (head == null) {
            System.out.println("链表为空");
            return false;
        }
        Emp curEmp = head;//  1  8 15
        while (true) {
            if(head.id == id){//当删除第一个元素头结点时,将头节点的下一个元素赋值给head,当下一个元素为null时,head为null
                head =head.next;//head.next可能为null,也可能是Emp实体
                return true;
            }
            else if(curEmp.next!=null&&curEmp.next.id==id){//当循环到 1时,如果 1 的下一个元素的id时删除的节点,将 删除节点的next赋值给当前前节点的next
                 curEmp.next=curEmp.next.next;//curEmp.next可能为null 也可能为Emp实体
                return true;
            }
            if(curEmp.next==null)
                return false;
            curEmp=curEmp.next;
        }



    }
}