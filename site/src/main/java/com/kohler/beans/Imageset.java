package com.kohler.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "kohler:imageset")
@Node(jcrType = "kohler:imageset")
public class Imageset extends HippoGalleryImageSet {
    @HippoEssentialsGenerated(internalName = "kohler:small")
    public HippoGalleryImageBean getSmall() {
        return getBean("kohler:small", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "kohler:large")
    public HippoGalleryImageBean getLarge() {
        return getBean("kohler:large", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "kohler:smallsquare")
    public HippoGalleryImageBean getSmallsquare() {
        return getBean("kohler:smallsquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "kohler:mediumsquare")
    public HippoGalleryImageBean getMediumsquare() {
        return getBean("kohler:mediumsquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "kohler:largesquare")
    public HippoGalleryImageBean getLargesquare() {
        return getBean("kohler:largesquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "kohler:banner")
    public HippoGalleryImageBean getBanner() {
        return getBean("kohler:banner", HippoGalleryImageBean.class);
    }
}
