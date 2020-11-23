package ru.netology.domain;

public class Post {
    private int postId;
    private int wallId;
    private int userId;
    private int postRepliersId;
    private String userName;
    private String avatarUrl;
    private String name;
    private String dateInfo;
    private String text;
    private String commentsInfo;
    private int likesAmount;
    private int rePost;
    private String imageUrl;
    private int viewsAmount;
    private int attachment;
    private String geo;
    private boolean canEdit;
    private boolean canDelete;
    private boolean canPin;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getWallId() {
        return wallId;
    }

    public void setWallId(int wallId) {
        this.wallId = wallId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostRepliersId() {
        return postRepliersId;
    }

    public void setPostRepliersId(int postRepliersId) {
        this.postRepliersId = postRepliersId;
    }

    public int getAttachment() {
        return attachment;
    }

    public void setAttachment(int attachment) {
        this.attachment = attachment;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isFavoured() {
        return isFavoured;
    }

    public void setFavoured(boolean favoured) {
        isFavoured = favoured;
    }

    private boolean isFavoured;




    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getViewsAmount() {
        return viewsAmount;
    }

    public void setViewsAmount(int viewsAmount) {
        this.viewsAmount = viewsAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateInfo() {
        return dateInfo;
    }

    public void setDateInfo(String dateInfo) {
        this.dateInfo = dateInfo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(String commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getLikesAmount() {
        return likesAmount;
    }

    public void setLikesAmount(int likesAmount) {
        this.likesAmount = likesAmount;
    }

    public int getRePost() {
        return rePost;
    }

    public void setRePost(int rePost) {
        this.rePost = rePost;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
