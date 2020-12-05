package assignment.com.smsapplication.base

interface BasePresenterContract<V : assignment.com.smsapplication.base.BaseViewContract?> {
    fun onAttach(view: V)
    fun onDetach()
}