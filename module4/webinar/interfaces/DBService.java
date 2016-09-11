package webinar.interfaces;

import webinar.abstractClass.DeveloperEmployee;

/**
 * Created by Stan on 02.09.2016.
 */
public interface DBService {
    void test();
    void save(DeveloperEmployee employee);

    DeveloperEmployee get(long id);

    static DeveloperEmployee[] getAllDefeclopers(){

        return new DeveloperEmployee[0];
    }


}
