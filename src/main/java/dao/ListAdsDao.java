package dao;

import models.Ad;

import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {
    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null){
            ads = generateAds();
        }
        return ads;
    }

    public Long insert(Ad ad) {
        if(ads == null){
            ads = generateAds();
        }
        ad.setId((long) ads.size());
        ads.add(ad);
        return ad.getId();
    }

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
           1, 1, "dodge neon for sale", "Used 2004 Dodge Neon. Blows cold A/C."
        ));
        ads.add(new Ad(
           2, 1, "dodge neon for sale", "Used 2004 Dodge Neon. Blows cold A/C."
        ));
        ads.add(new Ad(
           3, 1, "dodge neon for sale", "Used 2004 Dodge Neon. Blows cold A/C."
        ));
        ads.add(new Ad(
           4, 1, "dodge neon for sale", "Used 2004 Dodge Neon. Blows cold A/C."
        ));

        return ads;
    }

}
