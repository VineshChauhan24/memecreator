package com.sanjay.memecreator.memetastic.data;

/**
 * Interface that contains all necessary methods to access memes from different sources
 */
public interface MemeOriginInterface {

    String getPath(int position, boolean bThumbnail);

    /**
     * gets and returns the number of available images
     *
     * @return the number of available images
     */
    int getLength();

    /**
     * indicates if the image is saved in the assets or somewhere else
     *
     * @return true if the image is saved in the assets or somewhere else
     */
    boolean isAsset();

    /**
     * creates and returns a valid path to a specific image
     *
     * @param position the position in the array/list of available images
     * @return the path to the image at the specified position
     */
    String getFilepath(int position);

    /**
     * creates and returns a valid path to a specific thumbnail of an image
     *
     * @param position the position in the array/list of available images
     * @return the path to the thumbnail of the image at the specified position
     */
    String getThumbnailPath(int position);

    /**
     * indicates the image should be able to be set as a favorite or not
     *
     * @return true if the image is favoritable, else false
     */
    boolean showFavButton();

    /**
     * Shuffle the list of items
     */
    void shuffleList();

    /**
     * Tell if the image is to be used as template
     *
     * @return true if is template
     */
    boolean isTemplate();
}
