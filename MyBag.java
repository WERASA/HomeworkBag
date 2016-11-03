import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lenovo on 2016/11/1.
 */
public class MyBag<T> implements Bag<T> {
    private  ArrayList mbag  ;
public MyBag (){
    mbag=new ArrayList();

    }

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

    public  ArrayList set (T thing) {


        mbag.add(thing);
       Collections.shuffle(mbag);


        return mbag ;
    }

    public void setMbag(ArrayList mbag) {
        this.mbag = mbag;
    }

   public ArrayList getMbag() {
        return mbag;
    }
    }



