# viewBindingJava
Binding the xml views to the java file &amp; Navigation Controller 

//in build.gradle

    viewBinding{
        enabled=true
    }

//in BaseFragment

FragmentBaseBinding fragmentBaseBinding;

//inside OnCreateView

fragmentBaseBinding = FragmentBaseBinding.inflate(inflater,container,false);
return fragmentBaseBinding.getRoot();

//use TextView directly 

fragmentBaseBinding.textTV.setText(R.string.used_view_binding_text);
