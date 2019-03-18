package zhou.yi.zookeeper;

import org.apache.zookeeper.*;

import java.io.IOException;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/3/18 11:24
 */
public class demo {
    // 会话超时时间，设置为与系统默认时间一致
    private static final int SESSION_TIMEOUT=30000;

    // 创建 ZooKeeper 实例
    ZooKeeper zk;

    // 创建 Watcher 实例
    Watcher wh=new Watcher(){
        public void process(WatchedEvent event) {
            System.out.println("已经触发了" + event.getType() + "事件！");
        }

    };

    // 初始化 ZooKeeper 实例
    private void createZKInstance() throws IOException
    {
        zk=new ZooKeeper("localhost:2181",demo.SESSION_TIMEOUT,this.wh);
    }

    private void ZKOperations() throws IOException,InterruptedException,KeeperException
    {
        System.out.println("/n1. 创建 ZooKeeper 节点 (znode ： zoo2, 数据： myData2 ，权限：OPEN_ACL_UNSAFE ，节点类型： Persistent");
        zk.create("/zoo2","myData2".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);

        System.out.println(" 节点状态： ["+zk.exists("/zoo2", true)+"]");

        System.out.println("/n2. 查看是否创建成功： ");
        System.out.println(new String(zk.getData("/zoo2",true,null)));

        System.out.println("/n3. 修改节点数据 ");
        zk.setData("/zoo2", "shenlan211314".getBytes(), -1);

        System.out.println("/n4. 查看是否修改成功： ");
        System.out.println(new String(zk.getData("/zoo2", true, null)));

        zk.create("/zoo3","myData3".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println("zoo3 ");
        System.out.println("/n3. 修改节点数据 ");
        zk.setData("/zoo3", "zhouyi".getBytes(), -1);
        System.out.println("/n4. 查看是否修改成功： ");
        System.out.println(new String(zk.getData("/zoo3",true,null)));
        //节点
        List<String> znodes = zk.getChildren("/",false);
        for (String znode:znodes) {
            System.out.println("znode:"+znode);
        }
        //        System.out.println("/n5. 删除节点 ");
        zk.delete("/zoo2", -1);
        zk.delete("/zoo3", -1);
        System.out.println("删除后");
        znodes = zk.getChildren("/",false);
        for (String znode:znodes) {
            System.out.println("znode:"+znode);
        }

        System.out.println("/n6. 查看节点是否被删除： ");
        System.out.println(" 节点状态： ["+zk.exists("/zoo2", false)+"]");
    }

    private void ZKClose() throws  InterruptedException
    {
        zk.close();
    }

    public static void main(String[] args) throws IOException,InterruptedException,KeeperException {
        demo dm=new demo();
        dm.createZKInstance( );
        dm.ZKOperations();
        dm.ZKClose();
    }
}
