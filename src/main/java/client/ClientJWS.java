package client;

import proxy.BS;
import proxy.BanqueServiceService;

public class ClientJWS {
    public static void main(String[] args) {
        BS bs = new BanqueServiceService().getBSPort();
        System.out.println(bs.conversion(4));
        System.out.println(bs.getCompte(1).getSolde());
    }
}
