.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Ljava/lang/String;

.field public 〺つふすそ:Ljava/io/OutputStream;

.field public ぁごぐすすぃ:Ljava/net/Socket;

.field public くし〴〺ぅ:Ljava/io/InputStream;

.field public づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

.field public なぎぱいぢぎ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;

.field public びぐびあび:[B


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;Ljava/net/Socket;Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/lang/String;)V
    .registers 7

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    iput-object p4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->くし〴〺ぅ:Ljava/io/InputStream;

    iput-object p5, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->〺つふすそ:Ljava/io/OutputStream;

    iput-object p6, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->〳ぜぞぜべっ:Ljava/lang/String;

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    iput-object p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;

    iput-object p3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->ぁごぐすすぃ:Ljava/net/Socket;

    const/16 p1, 0x2000

    new-array p1, p1, [B

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->びぐびあび:[B

    return-void
.end method


# virtual methods
.method public run()V
    .registers 9

    const-string v0, "LjkHdoL69Nf>\u001b6=\u001e`o\u0019jgH1n\u001cak\u001b6k\u001bc=\u001a6;\u001cghLg<LgmKdg\u0019g<O3=J4=\u001b7iNkhI"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u001dclM6<\u001cehHjf\u0019giJ4o\u0019aoJcfLcm\u001dbmO3:A4;Nbf\u001a6j\u0019c>\u001edgI6g\u001d3iIak\u001akgMjfO"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_14
    const/4 v2, 0x1

    :try_start_15
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->くし〴〺ぅ:Ljava/io/InputStream;

    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->びぐびあび:[B

    invoke-virtual {v3, v4}, Ljava/io/InputStream;->read([B)I

    move-result v3
    :try_end_1d
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_1d} :catch_73
    .catchall {:try_start_15 .. :try_end_1d} :catchall_71

    if-gtz v3, :cond_63

    :try_start_1f
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->〺つふすそ:Ljava/io/OutputStream;

    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_24
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_24} :catch_24

    :catch_24
    :try_start_24
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->くし〴〺ぅ:Ljava/io/InputStream;

    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_29
    .catch Ljava/io/IOException; {:try_start_24 .. :try_end_29} :catch_2a

    goto :goto_2b

    :catch_2a
    nop

    :goto_2b
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;

    if-eqz v3, :cond_12f

    :goto_2f
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;

    invoke-virtual {v3}, Ljava/lang/Thread;->isAlive()Z

    move-result v3

    if-eqz v3, :cond_3f

    :try_start_37
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;

    invoke-virtual {v3}, Ljava/lang/Thread;->join()V
    :try_end_3c
    .catch Ljava/lang/InterruptedException; {:try_start_37 .. :try_end_3c} :catch_3d

    goto :goto_2f

    :catch_3d
    nop

    goto :goto_2f

    :cond_3f
    :try_start_3f
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    iget-object v4, v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/くし〴〺ぅ;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->〳ぜぞぜべっ:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v3, v0, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/くし〴〺ぅ;->びぐびあび(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;Ljava/lang/String;Z)V
    :try_end_5a
    .catch Ljava/io/IOException; {:try_start_3f .. :try_end_5a} :catch_5a

    :catch_5a
    :try_start_5a
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->ぁごぐすすぃ:Ljava/net/Socket;

    if-eqz v0, :cond_12f

    :goto_5e
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_61
    .catch Ljava/io/IOException; {:try_start_5a .. :try_end_61} :catch_12f

    goto/16 :goto_12f

    :cond_63
    :try_start_63
    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->〺つふすそ:Ljava/io/OutputStream;

    iget-object v5, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->びぐびあび:[B

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6, v3}, Ljava/io/OutputStream;->write([BII)V

    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->〺つふすそ:Ljava/io/OutputStream;

    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V
    :try_end_70
    .catch Ljava/io/IOException; {:try_start_63 .. :try_end_70} :catch_73
    .catchall {:try_start_63 .. :try_end_70} :catchall_71

    goto :goto_14

    :catchall_71
    move-exception v3

    goto :goto_ab

    :catch_73
    move-exception v3

    :try_start_74
    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    iget-object v5, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/くし〴〺ぅ;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "NfiHe9\u001dfmNjk\u001ee9ObkI7:O7iL1gAe:I6>Afh\u001d`k@dm\u001a`iO4n\u001a`:Ie<\u00196jA3fK6o\u001d6fM1o\u001d4f\u001d6:L1j\u001c7:Ne>\u001a`=\u001aa<\u001bk=Akg"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->〳ぜぞぜべっ:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "\u001a6>M`mHam\u001d7o\u001dafHjgNbhOf>\u0019`mOjhJf"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v4, v3, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/くし〴〺ぅ;->びぐびあび(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;Ljava/lang/String;Z)V
    :try_end_aa
    .catch Ljava/io/IOException; {:try_start_74 .. :try_end_aa} :catch_ee
    .catchall {:try_start_74 .. :try_end_aa} :catchall_71

    goto :goto_ee

    :goto_ab
    :try_start_ab
    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->〺つふすそ:Ljava/io/OutputStream;

    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_b0
    .catch Ljava/io/IOException; {:try_start_ab .. :try_end_b0} :catch_b0

    :catch_b0
    :try_start_b0
    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->くし〴〺ぅ:Ljava/io/InputStream;

    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_b5
    .catch Ljava/io/IOException; {:try_start_b0 .. :try_end_b5} :catch_b6

    goto :goto_b7

    :catch_b6
    nop

    :goto_b7
    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;

    if-eqz v4, :cond_ed

    :goto_bb
    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;

    invoke-virtual {v4}, Ljava/lang/Thread;->isAlive()Z

    move-result v4

    if-eqz v4, :cond_cb

    :try_start_c3
    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;

    invoke-virtual {v4}, Ljava/lang/Thread;->join()V
    :try_end_c8
    .catch Ljava/lang/InterruptedException; {:try_start_c3 .. :try_end_c8} :catch_c9

    goto :goto_bb

    :catch_c9
    nop

    goto :goto_bb

    :cond_cb
    :try_start_cb
    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    iget-object v5, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/くし〴〺ぅ;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->〳ぜぞぜべっ:Ljava/lang/String;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v4, v0, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/くし〴〺ぅ;->びぐびあび(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;Ljava/lang/String;Z)V
    :try_end_e6
    .catch Ljava/io/IOException; {:try_start_cb .. :try_end_e6} :catch_e6

    :catch_e6
    :try_start_e6
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->ぁごぐすすぃ:Ljava/net/Socket;

    if-eqz v0, :cond_ed

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_ed
    .catch Ljava/io/IOException; {:try_start_e6 .. :try_end_ed} :catch_ed

    :catch_ed
    :cond_ed
    throw v3

    :catch_ee
    :goto_ee
    :try_start_ee
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->〺つふすそ:Ljava/io/OutputStream;

    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_f3
    .catch Ljava/io/IOException; {:try_start_ee .. :try_end_f3} :catch_f3

    :catch_f3
    :try_start_f3
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->くし〴〺ぅ:Ljava/io/InputStream;

    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_f8
    .catch Ljava/io/IOException; {:try_start_f3 .. :try_end_f8} :catch_f9

    goto :goto_fa

    :catch_f9
    nop

    :goto_fa
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;

    if-eqz v3, :cond_12f

    :goto_fe
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;

    invoke-virtual {v3}, Ljava/lang/Thread;->isAlive()Z

    move-result v3

    if-eqz v3, :cond_10e

    :try_start_106
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->なぎぱいぢぎ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;

    invoke-virtual {v3}, Ljava/lang/Thread;->join()V
    :try_end_10b
    .catch Ljava/lang/InterruptedException; {:try_start_106 .. :try_end_10b} :catch_10c

    goto :goto_fe

    :catch_10c
    nop

    goto :goto_fe

    :cond_10e
    :try_start_10e
    iget-object v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    iget-object v4, v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/くし〴〺ぅ;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->〳ぜぞぜべっ:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v3, v0, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/くし〴〺ぅ;->びぐびあび(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;Ljava/lang/String;Z)V
    :try_end_129
    .catch Ljava/io/IOException; {:try_start_10e .. :try_end_129} :catch_129

    :catch_129
    :try_start_129
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/ぺふねづ〺;->ぁごぐすすぃ:Ljava/net/Socket;
    :try_end_12b
    .catch Ljava/io/IOException; {:try_start_129 .. :try_end_12b} :catch_12f

    if-eqz v0, :cond_12f

    goto/16 :goto_5e

    :catch_12f
    :cond_12f
    :goto_12f
    return-void
.end method
