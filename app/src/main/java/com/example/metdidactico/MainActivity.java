package com.example.metdidactico;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.metdidactico.Fragments.BuscarFragment;
import com.example.metdidactico.Fragments.CarritoFragment;
import com.example.metdidactico.Fragments.InicioFragment;
import com.example.metdidactico.Fragments.ProductosFragment;
import com.example.metdidactico.Fragments.UsuarioFragment;
import com.example.metdidactico.RecyclerViews.AdaptadorMuestraProducto;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity implements AdaptadorMuestraProducto.IColecProductos {

    BottomNavigationView btnNavPrincipal;
    Fragment fragmentSeleccionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNavPrincipal = findViewById(R.id.btnNavPrincipal);
        fragmentSeleccionado = new InicioFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragContentMain,fragmentSeleccionado).commit();
        btnNavPrincipal.setOnNavigationItemSelectedListener(onNavMenuSelect);

    }


    BottomNavigationView.OnNavigationItemSelectedListener onNavMenuSelect= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId())
        {
            case R.id.menu_nav_home:
                fragmentSeleccionado = new InicioFragment();
                break;
            case R.id.menu_nav_search:
                fragmentSeleccionado = new BuscarFragment();
                break;
            case R.id.menu_nav_carrito:
                fragmentSeleccionado= new CarritoFragment();
                break;
            case R.id.menu_nav_registro:
                fragmentSeleccionado= new UsuarioFragment();
                break;
        }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragContentMain,fragmentSeleccionado).commit();

            return true;
        }
    };


    @Override
    public void ClickProduccion(String Titulo) {
        fragmentSeleccionado = new ProductosFragment(Titulo);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragContentMain,fragmentSeleccionado).commit();

    }
}
