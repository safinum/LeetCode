#include <stack>
#include <vector>

class Solution {
public:
    bool isValid(string s) {
        vector<char> stos;
        stos.reserve(s.length());
        for (int i = 0; i < s.length(); i++) {
            char dodaj = s[i];
            if(stos.empty()) {
                stos.push_back(dodaj);
                continue;
            }
            
            char ostatni = stos.back();
            
            if((dodaj == '}' && ostatni == '{') || (dodaj == ')' && ostatni == '(') || (dodaj == ']' && ostatni == '[')){
                stos.pop_back();
            }else{
                stos.push_back(dodaj);
            }
        }
        
        if (stos.empty() == true) {
            return true;
        } else {
            return false;
        }
    }
};