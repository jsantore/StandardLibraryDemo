import java.util.ArrayList;

void main(){
    int i = 5;
    var demo = new ArrayList<Integer>();
    demo.add(i);
    demo.add(i+1);
    demo.set(0, i+2);
    demo.set(5, i+3);
    for(var stuff: demo){
        System.out.println(stuff);
    }
}