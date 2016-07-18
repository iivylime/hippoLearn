package com.kohler.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import com.kohler.beans.Imageset;

@HippoEssentialsGenerated(internalName = "kohler:bannerdocument")
@Node(jcrType = "kohler:bannerdocument")
public class Banner extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "kohler:title")
    public String getTitle() {
        return getProperty("kohler:title");
    }

    @HippoEssentialsGenerated(internalName = "kohler:content")
    public HippoHtml getContent() {
        return getHippoHtml("kohler:content");
    }

    @HippoEssentialsGenerated(internalName = "kohler:link")
    public HippoBean getLink() {
        return getLinkedBean("kohler:link", HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "kohler:image")
    public Imageset getImage() {
        return getLinkedBean("kohler:image", Imageset.class);
    }
}
