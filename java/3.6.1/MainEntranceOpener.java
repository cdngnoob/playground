class MainEntranceOpener extends AbstractOpener {
    @Override
    public boolean open(String foo) {
        if (foo.equals("MainEntrance")) {
            return true;
        } else {
            return false;
        }
    }
}
