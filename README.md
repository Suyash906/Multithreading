# Multithreading


### What is Java Thread?
- Thread is a lightweight sub process
- It is the smallest independent unit of a program
- Contains a separate path of execution
- Every Java Program contains atleast one thread
- A thread is created and controlled by Java.lang.Thread class.

### Java Thread LifeCycle
- New : A new thread begins its lifecycle in this state and remains here until the program starts the thread. It is also known as a born thread
- Runnable : Once a newly threads starts, the thread comes under Runnable state. A thread stays in this state until it is executing its task.
- Running : In this state a thread starts executing run() method and the yeild() method can send them back to the Runnable state.
- Waiting : A thread enters this state when it is temporarily in an inactive state i.e. it is still alive but not eligible to run. It can be in waiting, sleeping or blocked state.
- Terminated : A runnable thread enters the terminated state when it completes its task or otherwise terminates.


### Reference
```
	https://youtu.be/TCd8QIS-2KI
```

