package leetcode;

import java.util.LinkedList;

/**
 * @description: 实现两个队列实现栈
 * @author: liuzhi
 * @Date: 2020-08-12 16:23
 **/
public class TowQueue<E> {
    private LinkedList<E>queue1 ;
    private LinkedList<E>queue2 ;

    public TowQueue(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    /**
     * 压栈
     *
     * 入栈非空的队列
     */
    public E push(E e) {
        if(queue1.size() ==0 && queue2.size() == 0){
            queue1.addLast(e); //将元素加到队列尾部
        }else if(queue1.size()!=0){ //q1非空
            queue1.addLast(e); //加到q1
        }else if(queue2.size()!=0){
            queue2.addLast(e);
        }
        return e;

    }

    /**
     * 弹出并删除元素
     */
    public E pop() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }

        if (!queue1.isEmpty() && queue2.isEmpty()) {  //q1非空，q2空
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }

        if (queue1.isEmpty() && !queue2.isEmpty()) { //q2非空
            while (queue2.size() > 1) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }

        return null;
    }

    @Override
    public String toString() {
        return this.queue1.toString() + ", " +this.queue2.toString();
    }

    public static void main(String[] args) {
        TowQueue<Integer> s = new TowQueue<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        System.out.println(s);
        s.push(4);
        s.push(5);
        s.pop();
        System.out.println(s);
    }

}
