package crc64056e42705afeb645;


public class QuizDescripTionActivity
	extends android.support.v7.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Quiz_App.Activities.QuizDescripTionActivity, Quiz App", QuizDescripTionActivity.class, __md_methods);
	}


	public QuizDescripTionActivity ()
	{
		super ();
		if (getClass () == QuizDescripTionActivity.class) {
			mono.android.TypeManager.Activate ("Quiz_App.Activities.QuizDescripTionActivity, Quiz App", "", this, new java.lang.Object[] {  });
		}
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
