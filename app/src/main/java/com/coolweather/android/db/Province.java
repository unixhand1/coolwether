package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;
import org.litepal.exceptions.DataSupportException;

public class Province extends LitePalSupport {


    private int id;
    private String provincename;
    private  int provinceCode;

    public Province() {
        super();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }
    public  int getProvinceCode(){
        return  provinceCode;
    }
    public  void  setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
