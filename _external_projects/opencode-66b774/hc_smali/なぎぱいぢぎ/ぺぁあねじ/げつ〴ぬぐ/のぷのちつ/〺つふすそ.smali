.class public final Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;
.super Ljava/io/InputStream;
.source ""


# instance fields
.field public 〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

.field public くし〴〺ぅ:Z

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;Z)V
    .registers 4

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;->くし〴〺ぅ:Z

    iput-boolean v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;->びぐびあび:Z

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    iput-boolean p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;->びぐびあび:Z

    return-void
.end method


# virtual methods
.method public available()I
    .registers 5

    iget-boolean v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;->くし〴〺ぅ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    return v1

    :cond_6
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    iget-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/くし〴〺ぅ;

    iget-boolean v3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;->びぐびあび:Z

    .line 1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v0

    if-eqz v3, :cond_15

    :try_start_12
    iget-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    goto :goto_17

    :cond_15
    iget-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->びぐびあび:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    .line 2
    :goto_17
    iget-object v3, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;

    if-eqz v3, :cond_30

    invoke-virtual {v3}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/なぎぱいぢぎ;->げつ〴ぬぐ()I

    move-result v3

    if-lez v3, :cond_22

    goto :goto_2b

    :cond_22
    iget-object v2, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    .line 3
    iget-boolean v2, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->ざとぅぼこ〺:Z

    if-eqz v2, :cond_2a

    const/4 v3, -0x1

    goto :goto_2b

    :cond_2a
    const/4 v3, 0x0

    .line 4
    :goto_2b
    monitor-exit v0

    if-lez v3, :cond_2f

    move v1, v3

    :cond_2f
    return v1

    .line 5
    :cond_30
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Kao\u001b4j\u001c7mM1jNdf\u001bamL`>AcjIeh\u001aanO6mJgfMd<\u00190=Abf\u001c4mIe:H4=\u001b1=KbkIdk\u001a"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_40
    move-exception v1

    .line 6
    monitor-exit v0
    :try_end_42
    .catchall {:try_start_12 .. :try_end_42} :catchall_40

    throw v1
.end method

.method public close()V
    .registers 1

    return-void
.end method

.method public read()I
    .registers 5

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;->read([BII)I

    move-result v3

    if-eq v3, v0, :cond_c

    const/4 v0, -0x1

    return v0

    :cond_c
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public read([B)I
    .registers 4

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .registers 9

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p2, :cond_48

    if-ltz p3, :cond_48

    add-int v0, p2, p3

    array-length v1, p1

    if-gt v0, v1, :cond_48

    if-ltz v0, :cond_48

    array-length v0, p1

    if-gt p2, v0, :cond_48

    const/4 v0, 0x0

    if-nez p3, :cond_15

    return v0

    :cond_15
    iget-boolean v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;->くし〴〺ぅ:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    iget-object v3, v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/くし〴〺ぅ;

    iget-boolean v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;->びぐびあび:Z

    .line 1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v1

    if-eqz v4, :cond_2a

    :try_start_27
    iget-object v3, v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->づざかべべ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    goto :goto_2c

    :cond_2a
    iget-object v3, v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->びぐびあび:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;

    :goto_2c
    invoke-virtual {v3, p1, p2, p3}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ([BII)I

    move-result p1
    :try_end_30
    .catch Ljava/lang/InterruptedException; {:try_start_27 .. :try_end_30} :catch_40
    .catchall {:try_start_27 .. :try_end_30} :catchall_3e

    if-gtz p1, :cond_34

    :try_start_32
    monitor-exit v1

    goto :goto_38

    :cond_34
    monitor-exit v1
    :try_end_35
    .catchall {:try_start_32 .. :try_end_35} :catchall_3e

    .line 2
    invoke-virtual {v1, p1, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ(IZ)V

    :goto_38
    if-ne p1, v2, :cond_3d

    const/4 p2, 0x1

    .line 3
    iput-boolean p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/〺つふすそ;->くし〴〺ぅ:Z

    :cond_3d
    return p1

    :catchall_3e
    move-exception p1

    goto :goto_46

    .line 4
    :catch_40
    :try_start_40
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1

    :goto_46
    monitor-exit v1
    :try_end_47
    .catchall {:try_start_40 .. :try_end_47} :catchall_3e

    throw p1

    .line 5
    :cond_48
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
