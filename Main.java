public class Main {
    //some tests of methods
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(6);
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());
        for(int i =0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("dsfa;ljk \n");
        list.add(2, 123);
        for(int i =0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        MyArrayList<String> listStrings = new MyArrayList<>();
        listStrings.add("str1");
        listStrings.add("str2");
        listStrings.add("str3");
        listStrings.add("str4");
        for(int i =0; i < listStrings.size(); i++){
            System.out.println(listStrings.get(i));
        }
        list.sort();
        System.out.println("\n");
        for(int i =0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
