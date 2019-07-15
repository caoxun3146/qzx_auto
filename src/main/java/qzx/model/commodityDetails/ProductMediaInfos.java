package qzx.model.commodityDetails;

import java.util.List;

public class ProductMediaInfos {

    private String sourceId;
    private List<String> previewImgs;
    private List<String> detailImgs;
    private List<String> videoImgs;
    private List<String> videoUrl;
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
    public String getSourceId() {
        return sourceId;
    }

    public void setPreviewImgs(List<String> previewImgs) {
        this.previewImgs = previewImgs;
    }
    public List<String> getPreviewImgs() {
        return previewImgs;
    }

    public void setDetailImgs(List<String> detailImgs) {
        this.detailImgs = detailImgs;
    }
    public List<String> getDetailImgs() {
        return detailImgs;
    }

    public void setVideoImgs(List<String> videoImgs) {
        this.videoImgs = videoImgs;
    }
    public List<String> getVideoImgs() {
        return videoImgs;
    }

    public void setVideoUrl(List<String> videoUrl) {
        this.videoUrl = videoUrl;
    }
    public List<String> getVideoUrl() {
        return videoUrl;
    }

}
