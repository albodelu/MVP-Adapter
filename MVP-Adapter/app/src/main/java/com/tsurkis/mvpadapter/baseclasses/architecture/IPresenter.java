package com.tsurkis.mvpadapter.baseclasses.architecture;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public interface IPresenter<ViewInterfaceType extends IView> {
    void loadView(ViewInterfaceType viewInterfaceType);
}
