response =input('which figure would you like to see? (1:Votage vs freq.,3:1D magnetic feil vs distance,4:2D magnetic feil vs distance,5:magnetic distrubution,6):','s')
if (response=='1')
    repsonse = 'input votage vs freq.'
%R_0=1;
%R_l=2;
%M=1;
%xa=-2:0.2:2;
%ya=-2:0.2:2;
%[x,y]=meshgrid(xa,ya);
%z=x.*exp(-x.^2-y.^2);
%mesh(x,z);
%x=1:0.05:5000;
%z=(((x.*M).^2).*R_l)/((R_0+R_l).*((R_0)^2+R_0.*R_l+(x.*M).^2));
%plot(x,z)
t = 0:.1:pi * 10;
y = sin(t);
figure (1)
plot(t,y);
xlabel ('Freq (Hz) ');
ylabel ('Volt ( V ) ');
title (' Coil Input Voltage(Sine wave)');
elseif (response=='2')
    repsonse = 'question2'
vo = 1;
c = 45e-6;
r = 1500;
f = 50;
tf = 70e-3;
w = 2 * pi * f;
t = 0:0.05e-3:tf;
n = length (t);
state = 'on';
for i = 1:n
vs(i) = vo * sin(w * t(i));
switch state
case'on'
vr(i) = vs(i);
ir = vs(i)/r; ic=w*c*vo*cos(w*t(i)); sumi = ir + ic;
if sumi<= 0
state = 'off'
ta = t(i);
end
case'off'
vr (i) = vo * sin (w * ta) * exp(-(t(i)- ta)/(r * c));
if vs(i) >= vr(i)
state = 'on';
end
end
end
figure(2)
plot (t, vs, ':',t,vr,'k','linewidth',5)
xlabel('Time (s)');
ylabel ('Voltage (v)');
elseif (response=='3')
    repsonse = 'question3'
clc
clear
close all
%Define global variables
global u0
u0=4*pi*1e-7; %permeability of free space
%Define coil parameters
I0=1; %Coil current in Amps
a=.1; %Coil radius in m
x_p=0; y_p=0; z_p=0; %Define coordinates of coil center point
%First we see how to calculate the magnetic field at a single point in space
%Input test point
x=0; y=0; z=.1;
[Bx,By,Bz] = magnetic_field_current_loop(x,y,z,x_p,y_p,z_p,a,I0);
clear xyz
%Input vector of points
x=0; y=0; 
z=linspace(0,.25,100); %These default coordinates calculates the magnetic field along the z axis through the center of the coil
[Bx,By,Bz] = magnetic_field_current_loop(x,y,z,x_p,y_p,z_p,a,I0);
figure
plot(z,Bz)
xlabel('z [m]')
ylabel('Bz [T]')
title('1D magnetic field')
elseif (response=='4')
    repsonse = 'question4'
%now we test how to calculate a 2D grid of points.
clear xyz
%input mesh of points in 2D plane
x=0; [y,z]=meshgrid(linspace(- .05,.05,25),linspace(0,.1,25));
%this is a 2d plane over the x=0 plane that extends away from the coils in the yz plane.
[Bx,By,Bz] =magnetic_field_current_loop(x,y,z,x_p,y_p,z_p,a,I0);
figure (3)
surf(y,z,Bz)
xlabel('y [m]')
ylabel('z [m]')
zlabel('Bz [T]')
title('2D magnetic field tests') 
color bar 
shading flat
elseif (response=='5')
    repsonse = 'question5'
clc
clear
close all
%Define global variables
global u0
u0=4*pi*1e-7; %permeability of free space
%Define coil parameters
I0=1; %Coil current in Amps
a=.1; %Coil radius in m
x_p1=0; y_p1=0; z_p1=0; %Define coordinates of coil 1 center point
x_p2=0; y_p2=0; z_p2=a; %Define coordinates of coil 2 center point
%input mesh of points in 2D plane
x=0; [y,z]=meshgrid(linspace(- .05,.05,25),linspace(0,.1,25));
%this is a 2d plane over the x=0 plane that extends away from the coils in the yz plane.
[Bx1,By1,Bz1] = magnetic_field_current_loop(x,y,z,x_p1,y_p1,z_p1,a,I0); %Calculate field from first coil
[Bx2,By2,Bz2] = magnetic_field_current_loop(x,y,z,x_p2,y_p2,z_p2,a,I0); %Calculate field from second coil
%Add the components
Bx=Bx1+Bx2;
By=By1+By2;
Bz=Bz1+Bz2;
%Calculate the magnitude of the vector
B_mag=sqrt(Bx.^2+By.^2+Bz.^2);
figure (4)
surf(y,z,B_mag)
xlabel('y [m]')
ylabel('z [m]')
zlabel('B [T]')
title('2D Magnetic Field Distributions')
color bar
shading flat
elseif (response=='6')
    repsonse = 'question6'
clc
ln = 20;
d = 2;
m = 1;
n = -1;
N = 20;
dl = ln/N;
xCm =  (d/2)*ones(1,N);
%m located @ +d/2...
xCn = (-d/2)*ones(1,N);
%n located @ -d/2...
yC = (-ln/2+dl/2) : dl : (ln/2-dl/2);
zC = zeros(1,N);
Lx = zeros(1,N);
Ly = dl*ones(1,N);
Lz = zeros(1,N);
NP = 125;
xPmax = 3*d;
zPmax = 2.5*d;
xP = linspace(-xPmax,xPmax,NP);
zP = linspace(-zPmax,zPmax,NP);
[xxP zzP] = meshgrid(xP,zP);
Bx = zeros(NP,NP);
By = zeros(NP,NP);
Bz = zeros(NP,NP);
for q = 1:N
rxm = xxP - xCm(q);
rxn = xxP - xCn(q);
ry = yC(q);
rz = zzP - zC(q);
rm = sqrt(rxm.^2+ry.^2+rz.^2);
rn = sqrt(rxn.^2+ry.^2+rz.^2);
r3m = rm.^3;
r3n = rn.^3;
Bx = Bx + m*Ly(q).*rz./r3m + n*Ly(q).*rz./r3n;
% By = 0;
Bz = Bz - m*Ly(q).*rxm./r3m - n*Ly(q).*rxn./r3n;
end
B = sqrt(Bx.^2 + By.^2 + Bz.^2);
B = B/max(max(B));
figure(5);
pcolor(xxP,zzP,B);
color map(jet);
shading interp;
axis equal;
axis([-xPmax xPmax -zPmax zPmax]); xlabel('<-- x -->');ylabel('<-- z -->'); 
title('Magnetic Field Distribution'); 
color bar;
%figure(6); 
%surf(xxP,zzP,B,'interp', 'Edge Colour' , 'none','Face Lighting','phong');
%daspect([1 1 1]);
%axis tight;
%view(0,30);
%cam lightright;
%color map(jet);
%grid off;
%axis off;
%color bar;
%title('Magnetic Field Distribution - Simulation and Visualization') 
figure(7);
quiver(xxP,zzP,Bx,Bz);
color map(lines);
%axis tight;
axis([-d d -0.75*d 0.75*d]);
title('Magnetic Field Distribution'); xlabel('<-- x -->');
ylabel('<-- z -->'); zoom on;
end
