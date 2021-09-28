#include <iostream>

int main(){
    using namespace std;

    int trialNums;
    cin >> trialNums;

    for (int trial = 0; trial < trialNums; trial++){
        int L, R;
        cin >> L;
        cin >> R;

        cout << L << " | "<< R << endl;
    }

}