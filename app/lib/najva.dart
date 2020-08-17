import 'package:najvaflutter/najvaflutter.dart';

class Najva extends NajvaFlutter {
  Najva(){
    init();

    getSubscribedToken().then((value) => print(value));
  }

  @override
  void onUserSubscribed(String token) {
    // TODO: implement onUserSubscribed
    super.onUserSubscribed(token);
    print(token);
  }


}