package com.kohler.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import com.kohler.beans.Imageset;

@HippoEssentialsGenerated(internalName = "kohler:product")
@Node(jcrType = "kohler:product")
public class Product extends ContentDocument {
    @HippoEssentialsGenerated(internalName = "kohler:string")
    public String getString() {
        return getProperty("kohler:string");
    }

    @HippoEssentialsGenerated(internalName = "kohler:text")
    public String getText() {
        return getProperty("kohler:text");
    }

    @HippoEssentialsGenerated(internalName = "kohler:catlog")
    public String getCatlog() {
        return getProperty("kohler:catlog");
    }

    @HippoEssentialsGenerated(internalName = "kohler:type")
    public String getType() {
        return getProperty("kohler:type");
    }

    @HippoEssentialsGenerated(internalName = "kohler:description")
    public HippoHtml getDescription() {
        return getHippoHtml("kohler:description");
    }

    @HippoEssentialsGenerated(internalName = "kohler:thumbnail")
    public Imageset getThumbnail() {
        return getLinkedBean("kohler:thumbnail", Imageset.class);
    }

    @HippoEssentialsGenerated(internalName = "kohler:midPicture")
    public Imageset getMidPicture() {
        return getLinkedBean("kohler:midPicture", Imageset.class);
    }

    @HippoEssentialsGenerated(internalName = "kohler:largePicture")
    public Imageset getLargePicture() {
        return getLinkedBean("kohler:largePicture", Imageset.class);
    }

    @HippoEssentialsGenerated(internalName = "kohler:price")
    public Double getPrice() {
        return getProperty("kohler:price");
    }

    @HippoEssentialsGenerated(internalName = "kohler:sku")
    public String getSku() {
        return getProperty("kohler:sku");
    }
}
