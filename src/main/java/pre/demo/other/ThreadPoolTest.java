package pre.demo.other;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池有界队列耗尽后的饱和策略.
 */
public class ThreadPoolTest {

    public static void main(String[] args) {
        new ThreadPoolTest().putRunnable();
    }

    private ExecutorService exec = new ThreadPoolExecutor(2, 3, 0L, TimeUnit.SECONDS, new LinkedBlockingDeque<>(5),
      // 1 Abort策略：默认策略，新任务提交时直接抛出未检查的异常RejectedExecutionException，该异常可由调用者捕获。在之上的代码中已写。
      // new ThreadPoolExecutor.AbortPolicy());

      // 2 CallerRuns策略：为调节机制，既不抛弃任务也不抛出异常，而是将某些任务回退到调用者。不会在线程池的线程中执行新的任务，而是在调用exector的线程中运行新的任务。
      // new ThreadPoolExecutor.CallerRunsPolicy());

      // 3 Discard策略：新提交的任务被抛弃。
      // new ThreadPoolExecutor.DiscardPolicy());

      // 4 DiscardOldest策略：队列的是“队头”的任务，然后尝试提交新的任务。（不适合工作队列为优先队列场景）
      new ThreadPoolExecutor.DiscardOldestPolicy());



    private void putRunnable() {
        for (int i = 0; i < 10; i++) {
            exec.submit(new Task());
        }
        exec.shutdown();
    }

    static class Task implements Runnable {
        private static int count = 0;
        private int id = 0;

        public Task() {
            id = ++count;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("任务" + id + ":" + Thread.currentThread().getName());
        }
    }
}
