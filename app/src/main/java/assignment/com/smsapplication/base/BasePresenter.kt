package assignment.com.smsapplication.base

open class BasePresenter<V : assignment.com.smsapplication.base.BaseViewContract?> : BasePresenterContract<V> {
    protected val TAG = javaClass.simpleName
    var view: V? = null
        protected set

    override fun onAttach(view: V) {
        this.view = view
    }

    override fun onDetach() {
        view = null
    }

    val isViewAttached: Boolean
        get() = view != null

}