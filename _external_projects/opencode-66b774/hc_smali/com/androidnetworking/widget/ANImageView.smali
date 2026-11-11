.class public Lcom/androidnetworking/widget/ANImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source ""


# instance fields
.field public ぁごぐすすぃ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;

.field public づざかべべ:I

.field public なぎぱいぢぎ:I

.field public びぐびあび:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/androidnetworking/widget/ANImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/androidnetworking/widget/ANImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .registers 1

    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatImageView;->drawableStateChanged()V

    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 2

    iget-object v0, p0, Lcom/androidnetworking/widget/ANImageView;->ぁごぐすすぃ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->げつ〴ぬぐ()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/androidnetworking/widget/ANImageView;->ぁごぐすすぃ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;

    :cond_d
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 6

    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/androidnetworking/widget/ANImageView;->くし〴〺ぅ(Z)V

    return-void
.end method

.method public setDefaultImageResId(I)V
    .registers 2

    iput p1, p0, Lcom/androidnetworking/widget/ANImageView;->づざかべべ:I

    return-void
.end method

.method public setErrorImageResId(I)V
    .registers 2

    iput p1, p0, Lcom/androidnetworking/widget/ANImageView;->なぎぱいぢぎ:I

    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lcom/androidnetworking/widget/ANImageView;->びぐびあび:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/androidnetworking/widget/ANImageView;->くし〴〺ぅ(Z)V

    return-void
.end method

.method public くし〴〺ぅ(Z)V
    .registers 16

    invoke-virtual {p0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v2

    invoke-virtual {p0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_2a

    invoke-virtual {p0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v6, -0x2

    if-ne v3, v6, :cond_1f

    const/4 v3, 0x1

    goto :goto_20

    :cond_1f
    const/4 v3, 0x0

    :goto_20
    invoke-virtual {p0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    iget v7, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne v7, v6, :cond_2b

    const/4 v6, 0x1

    goto :goto_2c

    :cond_2a
    const/4 v3, 0x0

    :cond_2b
    const/4 v6, 0x0

    :goto_2c
    if-eqz v3, :cond_32

    if-eqz v6, :cond_32

    const/4 v7, 0x1

    goto :goto_33

    :cond_32
    const/4 v7, 0x0

    :goto_33
    if-nez v0, :cond_3a

    if-nez v1, :cond_3a

    if-nez v7, :cond_3a

    return-void

    :cond_3a
    iget-object v7, p0, Lcom/androidnetworking/widget/ANImageView;->びぐびあび:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_58

    iget-object p1, p0, Lcom/androidnetworking/widget/ANImageView;->ぁごぐすすぃ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;

    if-eqz p1, :cond_4c

    invoke-virtual {p1}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->げつ〴ぬぐ()V

    iput-object v8, p0, Lcom/androidnetworking/widget/ANImageView;->ぁごぐすすぃ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;

    .line 1
    :cond_4c
    iget p1, p0, Lcom/androidnetworking/widget/ANImageView;->づざかべべ:I

    if-eqz p1, :cond_54

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    goto :goto_57

    :cond_54
    invoke-virtual {p0, v8}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :goto_57
    return-void

    .line 2
    :cond_58
    iget-object v7, p0, Lcom/androidnetworking/widget/ANImageView;->ぁごぐすすぃ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;

    if-eqz v7, :cond_79

    .line 3
    iget-object v7, v7, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->びぐびあび:Ljava/lang/String;

    if-eqz v7, :cond_79

    .line 4
    iget-object v9, p0, Lcom/androidnetworking/widget/ANImageView;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_69

    return-void

    :cond_69
    iget-object v7, p0, Lcom/androidnetworking/widget/ANImageView;->ぁごぐすすぃ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;

    invoke-virtual {v7}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->げつ〴ぬぐ()V

    .line 5
    iget v7, p0, Lcom/androidnetworking/widget/ANImageView;->づざかべべ:I

    if-eqz v7, :cond_76

    invoke-virtual {p0, v7}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    goto :goto_79

    :cond_76
    invoke-virtual {p0, v8}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_79
    :goto_79
    if-eqz v3, :cond_7c

    const/4 v0, 0x0

    :cond_7c
    if-eqz v6, :cond_7f

    const/4 v1, 0x0

    .line 6
    :cond_7f
    sget-object v3, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->ぺぁあねじ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    if-nez v3, :cond_9d

    const-class v3, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    monitor-enter v3

    :try_start_86
    sget-object v5, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->ぺぁあねじ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    if-nez v5, :cond_98

    new-instance v5, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    new-instance v6, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/げつ〴ぬぐ;

    sget v7, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->〳ぜぞぜべっ:I

    invoke-direct {v6, v7}, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(I)V

    invoke-direct {v5, v6}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;-><init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$くし〴〺ぅ;)V

    sput-object v5, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->ぺぁあねじ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    :cond_98
    monitor-exit v3

    goto :goto_9d

    :catchall_9a
    move-exception p1

    monitor-exit v3
    :try_end_9c
    .catchall {:try_start_86 .. :try_end_9c} :catchall_9a

    throw p1

    :cond_9d
    :goto_9d
    sget-object v3, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->ぺぁあねじ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    .line 7
    iget-object v11, p0, Lcom/androidnetworking/widget/ANImageView;->びぐびあび:Ljava/lang/String;

    new-instance v12, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;

    invoke-direct {v12, p0, p1}, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;-><init>(Lcom/androidnetworking/widget/ANImageView;Z)V

    .line 8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v5

    if-ne p1, v5, :cond_172

    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0xc

    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "#W"

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "#H"

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "#S"

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v5

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    iget-object v5, v3, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$くし〴〺ぅ;

    check-cast v5, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/げつ〴ぬぐ;

    if-eqz p1, :cond_16a

    .line 12
    monitor-enter v5

    :try_start_e8
    iget-object v6, v5, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_f8

    iget v7, v5, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:I

    add-int/2addr v7, v4

    iput v7, v5, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:I

    monitor-exit v5

    move-object v8, v6

    goto :goto_fe

    :cond_f8
    iget v6, v5, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->ぁごぐすすぃ:I

    add-int/2addr v6, v4

    iput v6, v5, Lなぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/〺つふすそ;->ぁごぐすすぃ:I

    monitor-exit v5
    :try_end_fe
    .catchall {:try_start_e8 .. :try_end_fe} :catchall_167

    .line 13
    :goto_fe
    move-object v7, v8

    check-cast v7, Landroid/graphics/Bitmap;

    if-eqz v7, :cond_111

    .line 14
    new-instance p1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, p1

    move-object v6, v3

    move-object v8, v11

    invoke-direct/range {v5 .. v10}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;-><init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$づざかべべ;)V

    invoke-virtual {v12, p1, v4}, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;->げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;Z)V

    goto :goto_164

    :cond_111
    new-instance v13, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;

    const/4 v7, 0x0

    move-object v5, v13

    move-object v6, v3

    move-object v8, v11

    move-object v9, p1

    move-object v10, v12

    invoke-direct/range {v5 .. v10}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;-><init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$づざかべべ;)V

    invoke-virtual {v12, v13, v4}, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;->げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;Z)V

    iget-object v4, v3, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->〺つふすそ:Ljava/util/HashMap;

    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;

    if-eqz v4, :cond_12f

    .line 15
    iget-object p1, v4, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/LinkedList;

    invoke-virtual {p1, v13}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_163

    .line 16
    :cond_12f
    new-instance v4, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$びぐびあび;

    invoke-direct {v4, v11}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$びぐびあび;-><init>(Ljava/lang/String;)V

    const-string v5, "ImageRequestTag"

    .line 17
    iput-object v5, v4, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$びぐびあび;->〺つふすそ:Ljava/lang/Object;

    .line 18
    iput v1, v4, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$びぐびあび;->づざかべべ:I

    .line 19
    iput v0, v4, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$びぐびあび;->びぐびあび:I

    .line 20
    iput-object v2, v4, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$びぐびあび;->なぎぱいぢぎ:Landroid/widget/ImageView$ScaleType;

    .line 21
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 22
    iput-object v0, v4, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$びぐびあび;->くし〴〺ぅ:Landroid/graphics/Bitmap$Config;

    .line 23
    new-instance v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    invoke-direct {v0, v4}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;-><init>(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$びぐびあび;)V

    .line 24
    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/げつ〴ぬぐ;

    invoke-direct {v1, v3, p1}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;Ljava/lang/String;)V

    .line 25
    sget-object v2, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺぁあねじ;->なぎぱいぢぎ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺぁあねじ;

    iput-object v2, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぁごぐすすぃ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺぁあねじ;

    iput-object v1, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぶでにく〼〳:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;

    invoke-static {}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->〺つふすそ()Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;

    move-result-object v1

    invoke-virtual {v1, v0}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/くし〴〺ぅ;->げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 26
    iget-object v1, v3, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->〺つふすそ:Ljava/util/HashMap;

    new-instance v2, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;

    invoke-direct {v2, v3, v0, v13}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;-><init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;)V

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_163
    move-object p1, v13

    .line 27
    :goto_164
    iput-object p1, p0, Lcom/androidnetworking/widget/ANImageView;->ぁごぐすすぃ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;

    return-void

    :catchall_167
    move-exception p1

    .line 28
    :try_start_168
    monitor-exit v5
    :try_end_169
    .catchall {:try_start_168 .. :try_end_169} :catchall_167

    throw p1

    :cond_16a
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "key == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 29
    :cond_172
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ImageLoader must be invoked from the main thread."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
