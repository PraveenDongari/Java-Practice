public class ThreadStates {
    public static void main(String[] args) {
        /*
         * thread states
         * 1. new
         * 2. runnable
         * 3. runnable
         * 4. waiting
         * 5. dead
         * 
         * 
         * Runnable
         * new
         * waiting
         * Ruuning
         * 
         * dead
         * 
         * 
         * 
         * new----------start()----------Runnable
         * 
         * when the thread is executing and then it is waiting for the scheduleer.
         * 
         * when the thread is actually running on the cpu it is in running state.
         * 
         * running--->sleep()/wait()/join()--->waiting
         * 
         * 
         * running--->stop()--->dead
         * 
         */
    }
}
