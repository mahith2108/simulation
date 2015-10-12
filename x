ampl: solve;CPLEX 12.6.1.0: optimal integer solution; objective 0
2327 MIP simplex iterations
450 branch-and-bound nodes
No basis.
ampl: _display _OBJS;_display 1 0 1
_OBJS
overtime_cost
ampl: show overtime_cost;minimize overtime_cost: sum{o in OPERATING_ROOMS} overtime_penalty*
  overtime[o];
ampl: _display indexarity('overtime_cost');_display 0 1 1
indexarity('overtime_cost')
0
ampl: option 'omit_zero_rows';option omit_zero_rows 0;
ampl: _display overtime_cost.val ;_display 0 1 1
overtime_cost
0
ampl: _display overtime_cost.val;_display 0 1 1
overtime_cost
0
ampl: display overtime_cost;overtime_cost = 0

ampl: _display _VARS;_display 1 0 6
_VARS
preop_start_time
op_start_time
op_end_time
y
z
overtime
ampl: show preop_start_time;var preop_start_time{s in SURGERIES}  integer >= 1;
ampl: _display indexarity('preop_start_time');_display 0 1 1
indexarity('preop_start_time')
1
ampl: show op_start_time;var op_start_time{s in SURGERIES}  integer >= 1;
ampl: _display indexarity('op_start_time');_display 0 1 1
indexarity('op_start_time')
1
ampl: show op_end_time;var op_end_time{s in SURGERIES}  integer >= 1;
ampl: _display indexarity('op_end_time');_display 0 1 1
indexarity('op_end_time')
1
ampl: show y;var y{s_prim in SURGERIES, s_bis in SURGERIES: s_prim != s_bis}  binary;
ampl: _display indexarity('y');_display 0 1 1
indexarity('y')
2
ampl: show z;var z{s_prim in SURGERIES, s_bis in SURGERIES: s_prim != s_bis}  binary;
ampl: _display indexarity('z');_display 0 1 1
indexarity('z')
2
ampl: show overtime;var overtime{o in OPERATING_ROOMS}  integer >= 0;
ampl: _display indexarity('overtime');_display 0 1 1
indexarity('overtime')
1
ampl: _display op_end_time.val;_display 1 1 6
op_end_time.val
s1,91
s2,301
s3,511
s4,166
s5,336
s6,511
ampl: _display op_start_time.val;_display 1 1 6
op_start_time.val
s1,31
s2,221
s3,421
s4,46
s5,196
s6,366
ampl: display op_start_time;op_start_time [*] :=
s1   31
s2  221
s3  421
s4   46
s5  196
s6  366
;

ampl: display y;y [*,*]
:   s1  s2  s3  s4  s5  s6    :=
s1   .   0   0   1   0   0
s2   1   .   0   1   1   0
s3   1   1   .   1   1   1
s4   1   0   0   .   0   0
s5   1   0   0   1   .   0
s6   1   1   0   1   1   .
;

ampl: display z;