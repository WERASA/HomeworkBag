import java.util.ArrayList;

/**
 * Created by lenovo on 2016/11/1.
 */
public class MyBag<T> implements Bag<T> {
    private  ArrayList mbag  ;

    public boolean include(Object thing){
        if (mbag.contains(thing))
            return true;
        else
            return false;
    }
    @Override
    public boolean isEmply(){
       if (mbag.isEmpty())
          return true;
      else
          return false;
    }
    public  void  setMbag (T thing) {
        ArrayList bag=new ArrayList();
        bag.add(thing);
        this.mbag = bag;
    }
    public ArrayList getMbag() {
        return mbag;
    }
    }



