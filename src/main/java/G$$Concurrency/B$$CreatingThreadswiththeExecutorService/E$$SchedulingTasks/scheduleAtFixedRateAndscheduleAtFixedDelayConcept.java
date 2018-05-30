package G$$Concurrency.B$$CreatingThreadswiththeExecutorService.E$$SchedulingTasks;

public class scheduleAtFixedRateAndscheduleAtFixedDelayConcept {
    
    /*
    The scheduleAtFixedRate() method creates a new task and submits it to the executor
every period, regardless of whether or not the previous task fi nished. The following exam-
ple executes a Runnable task every minute, following an initial fi ve-minute delay:
service.scheduleAtFixedRate(command,5,1,TimeUnit.MINUTE);


One risk of using this method is the possibility a task could consistently take lon-
ger to run than the period between tasks. What would happen if the task consis-
tently took fi ve minutes to execute? Despite the fact that the task is still running, the
ScheduledExecutorService would submit a new task to be started every minute. If a
single-thread executor was used, over time this would result in endless set tasks being
scheduled, which would run back to back assuming that no other tasks were submitted to
the ScheduledExecutorService .



On the other hand, the scheduleAtFixedDelay() method creates a new task after the
previous task has fi nished. For example, if the fi rst task runs at 12:00 and takes fi ve min-
utes to fi nish, with a period of 2 minutes, then the second task will start at 12:07.
service.scheduleAtFixedDelay(command,0,2,TimeUnit.MINUTE);
     */
}
