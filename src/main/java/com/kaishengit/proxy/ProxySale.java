package com.kaishengit.proxy;

/**
 * Created by hoyt on 2017/10/29.
 */

public class ProxySale implements Sale {

    private Sale sale;

    public ProxySale(Sale sale) {
        this.sale = sale;
    }

    public void salePC() {
        sale.salePC();
    }
}
