#include <iostream>
using namespace std;

#define PI 3.141592653589793238462
int main(void)
{
	int r = 0;
	cin >> r;
	
	double result = 0.0;
	
	cout.setf(ios::fixed);
	cout.precision(6);
	result = r * r * PI;
	cout << result << endl;
	
	result = static_cast<double>(r) * r + static_cast<double>(r) * r;
	cout << result << endl;
	return 0;
}