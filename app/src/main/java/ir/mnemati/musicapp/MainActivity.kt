package ir.mnemati.musicapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Visibility
import android.view.View
import ir.mnemati.musicapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var mdPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mdPlayer = MediaPlayer.create(this, R.raw.renaissance)

        binding.imgPlay.setOnClickListener {
            mdPlayer.start()
            binding.imgPause.visibility = View.VISIBLE
            binding.imgPlay.visibility =  View.INVISIBLE
        }

        binding.imgPause.setOnClickListener {
            mdPlayer.pause()
            binding.imgPause.visibility = View.INVISIBLE
            binding.imgPlay.visibility =  View.VISIBLE
        }


    } //end of onCreate


} // end od class