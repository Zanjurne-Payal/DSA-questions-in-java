package array;
class demoArray{
    public void demo() {
        //1 d array
        int[] ages = new int[4];
        ages[0] = 18;
        ages[1] = 20;
        ages[2] = 50;
        ages[3] = 34;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);

        // 2 d array
        //METHOD 1
//        String[][] names = new String[3][3];
//        names[0][0] = "payal";
//        names[0][1] = "Pandurang";
//        names[0][2] = "Zanjurne";
//
//        names[1][0] = "Kajal";
//        names[1][1] = "Rajendra";
//        names[1][2] = "Supekar";
//
//        names[2][0] = "Tejaswini";
//        names[2][1] = "Uddesh";
//        names[2][2] = "Patil";
//
//        System.out.println(names[0][0]);
//        System.out.println(names[0][1]);
//        System.out.println(names[0][2]);
//
//        System.out.println(names[1][0]);
//        System.out.println(names[1][1]);
//        System.out.println(names[1][2]);
//
//        System.out.println(names[2][0]);
//        System.out.println(names[2][1]);
//        System.out.println(names[2][2]);

        //method 2
        String[][] names= {{"payal","teju","kajal"},{"shubham","akshay","sudhir"},{"java","python","c++"}};
        System.out.println(names[0][0]);
        System.out.println(names[0][1]);
        System.out.println(names[0][2]);

        System.out.println(names[1][0]);
        System.out.println(names[1][1]);
        System.out.println(names[1][2]);

        System.out.println(names[2][0]);
        System.out.println(names[2][1]);
        System.out.println(names[2][2]);

    //3 d array
        double[][][] weight = {{
                {1.1,2.2},{3.3,4.4},{5.5,6.6}},
                {{1.11,2.22},{3.33,4.33},{5.55,6.66}},
                {{54.3,555},{55.6,55.3},{33.3,225.5}}
        };
        System.out.println(weight[0][0][0]);
        System.out.println(weight[0][0][1]);
        System.out.println(weight[0][1][0]);
        System.out.println(weight[0][1][1]);
        System.out.println(weight[0][2][0]);
        System.out.println(weight[0][2][1]);

        System.out.println(weight[1][0][0]);
        System.out.println(weight[1][0][1]);
        System.out.println(weight[1][1][0]);
        System.out.println(weight[1][1][1]);
        System.out.println(weight[1][2][0]);
        System.out.println(weight[1][2][1]);

        System.out.println(weight[2][0][0]);
        System.out.println(weight[2][0][1]);
        System.out.println(weight[2][1][0]);
        System.out.println(weight[2][1][1]);
        System.out.println(weight[2][2][0]);
        System.out.println(weight[2][2][1]);

        System.out.println("length of weight "+weight.length);
        System.out.println("length of weight[0] "+weight[0].length);
        System.out.println("length of weight[0][0] "+weight[0][0].length);
    }
}
public class basic {
    public static void main(String[] args) {
        demoArray obj = new demoArray();
        obj.demo();
    }
}
