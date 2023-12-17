package swcs.gof.structural.facade.smarthome;

class Client {

  public static void main(String[] args) {
    SmartHomeFacade smartHomeFacade = new SmartHomeFacade();

    smartHomeFacade.leaveHome();
    smartHomeFacade.returnHome();
  }
}
