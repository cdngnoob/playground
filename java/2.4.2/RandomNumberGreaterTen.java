class RandomNumberGreaterTen {

    RandomNumber rand = new RandomNumber();
    
    int greaterTen(){
        while (true){
            rand.giveNumber();
                
            if (rand.giveNumber() > 10){
                return rand.giveNumber();
            }
        }
    }
}
