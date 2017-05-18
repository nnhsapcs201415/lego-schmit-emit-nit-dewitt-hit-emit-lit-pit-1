import lejos.nxt.Sound;
class FinalRobotMusic extends Thread {
    public void run() {
        while(true) {
            try {

                int RT = -1;
                int A1 = 880;
                int B1 = 988;
                int C1 = 1047;
                int D1 = 1175;
                int E1 = 1319;
                int F1 = 1397;
                int G1 = 1568;

                int A2F = 1661;
                int A2 = 1760;
                int B2F = 1865;
                int B2 = 1976;
                int C2 = 2093;
                int D2 = 2349;
                int E2F = 2489;
                int E2 = 2637;
                int F2 = 2794;
                int G2F = 2960;
                int G2 = 3136;

                int A3F = 3322;
                int A3 = 3520;

                int C4 = 4186;
                // Note, notelength, restlength
                int[] arr = {
                        E2,150,200, 
                        E2,150,200, 
                        RT,
                        E2,150,200,
                        RT,
                        C2,150,200,
                        E2,150,200,
                        RT, 
                        G2,150,200,
                        RT, 
                        RT, 
                        RT, 
                        G1,150,200, 
                        RT, 
                        RT, 
                        RT,
                        C2,150,200, 
                        RT, 
                        RT, 
                        G1,150,200, 
                        RT, 
                        RT, 
                        E1,150,200, 
                        RT, 
                        RT, 
                        A2,150,200,
                        RT,
                        B2,150,200,
                        RT,
                        B2F,150,200,
                        A2,150,200,
                        RT,
                        G1,200,200,
                        E2,200,200,
                        G2,200,200,
                        A3,150,200,
                        RT,
                        F2,150,200,
                        G2,150,200,
                        RT,
                        E2,150,200,
                        RT,
                        C2,150,200,
                        D2,150,200,
                        B2,150,200,
                        RT,
                        RT,
                        C2,150,200,
                        RT,
                        RT,
                        G1,150,200,
                        RT,
                        RT,
                        E1,150,200,
                        RT,
                        RT,
                        A2,150,200,
                        RT,
                        B2,150,200,
                        RT,
                        B2F,150,200,
                        A2,150,200,
                        RT,
                        G1,200,200,
                        E2,200,200,
                        G2,200,200,
                        A3,150,200,
                        RT,
                        F2,150,200,
                        G2,150,200,
                        RT,
                        E2,150,200,
                        RT,
                        C2,150,200,
                        D2,150,200,
                        B2,150,200,
                        RT,
                        RT,
                        G2,150,200,
                        G2F,150,200,
                        F2,150,200,
                        E2F,150,200,
                        RT,
                        E2,150,200,
                        RT,
                        A2F,150,200,
                        A2,150,200,
                        C2,150,200,
                        RT,
                        A2,150,200,
                        C2,150,200,
                        D2,150,200,
                        RT,
                        RT,
                        G2,150,200,
                        G2F,150,200,
                        F2,150,200,
                        E2F,150,200,
                        RT,
                        E2,150,200,
                        RT,
                        C4,150,200,
                        RT,
                        C4,150,200,
                        C4,150,200,
                        RT,
                        RT,
                        RT,
                        RT,
                        RT,
                        G2,150,200,
                        G2F,150,200,
                        F2,150,200,
                        E2F,150,200,
                        RT,
                        E2,150,200,
                        RT,
                        A2F,150,200,
                        A2,150,200,
                        C2,150,200,
                        RT,
                        A2,150,200,
                        C2,150,200,
                        D2,150,200,
                        RT,
                        RT,
                        E2F,150,200,
                        RT,
                        RT,
                        D2,150,200,
                        RT,
                        RT,
                        C2,150,200,
                        RT,
                        RT,
                        RT,
                        RT,
                        RT,
                        RT,
                        RT,
                    };
                for (int a = 0; a < arr.length; a += 3)
                {
                    if (arr[a] != -1)
                    {
                        //System.out.println(arr[a] + " " + arr[a + 1] + " " + arr[a+2]);
                        Sound.playTone(arr[a], arr[a + 1]);
                        Thread.sleep(arr[a + 2]);
                    } else {
                        Thread.sleep(200);
                        a -= 2;
                    }
                }
            } catch (InterruptedException ie) {
            }
        }
    }
}