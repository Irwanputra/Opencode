.class public Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;
.super Landroid/graphics/drawable/Drawable;
.source ""

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;,
        Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;
    }
.end annotation


# static fields
.field public static final synthetic へぬ〴づぞ:I


# instance fields
.field public 〳ぜぞぜべっ:I

.field public 〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

.field public ぁごぐすすぃ:Z

.field public いいにぽつ:Ljava/lang/Runnable;

.field public くし〴〺ぅ:Landroid/graphics/Rect;

.field public づざかべべ:Landroid/graphics/drawable/Drawable;

.field public てぜきぽく:J

.field public なぎぱいぢぎ:I

.field public のぷのちつ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

.field public びぐびあび:Landroid/graphics/drawable/Drawable;

.field public ぺぁあねじ:Z

.field public ぺふねづ〺:J


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/16 v0, 0xff

    iput v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:I

    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〳ぜぞぜべっ:I

    return-void
.end method


# virtual methods
.method public applyTheme(Landroid/content/res/Resources$Theme;)V
    .registers 8

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_37

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->くし〴〺ぅ()V

    iget v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->〳ぜぞぜべっ:I

    iget-object v2, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぁごぐすすぃ:[Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    :goto_f
    if-ge v3, v1, :cond_30

    aget-object v4, v2, v3

    if-eqz v4, :cond_2d

    aget-object v4, v2, v3

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z

    move-result v4

    if-eqz v4, :cond_2d

    aget-object v4, v2, v3

    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->applyTheme(Landroid/content/res/Resources$Theme;)V

    iget v4, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->づざかべべ:I

    aget-object v5, v2, v3

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v5

    or-int/2addr v4, v5

    iput v4, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->づざかべべ:I

    :cond_2d
    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_30
    invoke-virtual {p1}, Landroid/content/res/Resources$Theme;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->なぎぱいぢぎ(Landroid/content/res/Resources;)V

    :cond_37
    return-void
.end method

.method public canApplyTheme()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->canApplyTheme()Z

    move-result v0

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_7
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_e

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_e
    return-void
.end method

.method public getAlpha()I
    .registers 2

    iget v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:I

    return v0
.end method

.method public getChangingConfigurations()I
    .registers 3

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    iget-object v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->getChangingConfigurations()I

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .registers 8

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    .line 1
    monitor-enter v0

    :try_start_3
    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->でどあくず:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_d

    iget-boolean v2, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぶでにく〼〳:Z
    :try_end_b
    .catchall {:try_start_3 .. :try_end_b} :catchall_3a

    :goto_b
    monitor-exit v0

    goto :goto_2b

    :cond_d
    :try_start_d
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->くし〴〺ぅ()V

    iput-boolean v3, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->でどあくず:Z

    iget v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->〳ぜぞぜべっ:I

    iget-object v4, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぁごぐすすぃ:[Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x0

    :goto_17
    if-ge v5, v1, :cond_27

    aget-object v6, v4, v5

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v6

    if-nez v6, :cond_24

    iput-boolean v2, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぶでにく〼〳:Z

    goto :goto_b

    :cond_24
    add-int/lit8 v5, v5, 0x1

    goto :goto_17

    :cond_27
    iput-boolean v3, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぶでにく〼〳:Z
    :try_end_29
    .catchall {:try_start_d .. :try_end_29} :catchall_3a

    monitor-exit v0

    const/4 v2, 0x1

    :goto_2b
    if-eqz v2, :cond_38

    .line 2
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->getChangingConfigurations()I

    move-result v1

    iput v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->びぐびあび:I

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    return-object v0

    :cond_38
    const/4 v0, 0x0

    return-object v0

    :catchall_3a
    move-exception v1

    .line 3
    monitor-exit v0

    goto :goto_3e

    :goto_3d
    throw v1

    :goto_3e
    goto :goto_3d
.end method

.method public getCurrent()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getHotspotBounds(Landroid/graphics/Rect;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Landroid/graphics/Rect;

    if-eqz v0, :cond_8

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_b

    :cond_8
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getHotspotBounds(Landroid/graphics/Rect;)V

    :goto_b
    return-void
.end method

.method public getIntrinsicHeight()I
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    .line 1
    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->てぜきぽく:Z

    if-eqz v1, :cond_10

    .line 2
    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->のぷのちつ:Z

    if-nez v1, :cond_d

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->〺つふすそ()V

    :cond_d
    iget v0, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->おぐぴう〸ず:I

    return v0

    .line 3
    :cond_10
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    goto :goto_1a

    :cond_19
    const/4 v0, -0x1

    :goto_1a
    return v0
.end method

.method public getIntrinsicWidth()I
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    .line 1
    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->てぜきぽく:Z

    if-eqz v1, :cond_10

    .line 2
    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->のぷのちつ:Z

    if-nez v1, :cond_d

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->〺つふすそ()V

    :cond_d
    iget v0, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->へぬ〴づぞ:I

    return v0

    .line 3
    :cond_10
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    goto :goto_1a

    :cond_19
    const/4 v0, -0x1

    :goto_1a
    return v0
.end method

.method public getMinimumHeight()I
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    .line 1
    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->てぜきぽく:Z

    if-eqz v1, :cond_10

    .line 2
    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->のぷのちつ:Z

    if-nez v1, :cond_d

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->〺つふすそ()V

    :cond_d
    iget v0, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぉざぅち〻:I

    return v0

    .line 3
    :cond_10
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v0

    goto :goto_1a

    :cond_19
    const/4 v0, 0x0

    :goto_1a
    return v0
.end method

.method public getMinimumWidth()I
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    .line 1
    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->てぜきぽく:Z

    if-eqz v1, :cond_10

    .line 2
    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->のぷのちつ:Z

    if-nez v1, :cond_d

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->〺つふすそ()V

    :cond_d
    iget v0, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぇぬぎばつ:I

    return v0

    .line 3
    :cond_10
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    goto :goto_1a

    :cond_19
    const/4 v0, 0x0

    :goto_1a
    return v0
.end method

.method public getOpacity()I
    .registers 8

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    const/4 v1, -0x2

    if-eqz v0, :cond_3b

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_3b

    :cond_c
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    .line 1
    iget-boolean v2, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ざとぅぼこ〺:Z

    if-eqz v2, :cond_16

    iget v0, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->は〲ぱなで:I

    move v1, v0

    goto :goto_3b

    :cond_16
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->くし〴〺ぅ()V

    iget v2, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->〳ぜぞぜべっ:I

    iget-object v3, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぁごぐすすぃ:[Landroid/graphics/drawable/Drawable;

    if-lez v2, :cond_26

    const/4 v1, 0x0

    aget-object v1, v3, v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v1

    :cond_26
    const/4 v4, 0x1

    const/4 v5, 0x1

    :goto_28
    if-ge v5, v2, :cond_37

    aget-object v6, v3, v5

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v6

    invoke-static {v1, v6}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v1

    add-int/lit8 v5, v5, 0x1

    goto :goto_28

    :cond_37
    iput v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->は〲ぱなで:I

    iput-boolean v4, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ざとぅぼこ〺:Z

    :cond_3b
    :goto_3b
    return v1
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V

    :cond_7
    return-void
.end method

.method public getPadding(Landroid/graphics/Rect;)Z
    .registers 12

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    .line 1
    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぺぁあねじ:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_a

    goto :goto_5a

    :cond_a
    iget-object v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぺふねづ〺:Landroid/graphics/Rect;

    if-nez v1, :cond_59

    iget-boolean v5, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->いいにぽつ:Z

    if-eqz v5, :cond_13

    goto :goto_59

    :cond_13
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->くし〴〺ぅ()V

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iget v5, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->〳ぜぞぜべっ:I

    iget-object v6, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぁごぐすすぃ:[Landroid/graphics/drawable/Drawable;

    const/4 v7, 0x0

    :goto_20
    if-ge v7, v5, :cond_54

    aget-object v8, v6, v7

    invoke-virtual {v8, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result v8

    if-eqz v8, :cond_51

    if-nez v2, :cond_31

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v4, v4, v4, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    :cond_31
    iget v8, v1, Landroid/graphics/Rect;->left:I

    iget v9, v2, Landroid/graphics/Rect;->left:I

    if-le v8, v9, :cond_39

    iput v8, v2, Landroid/graphics/Rect;->left:I

    :cond_39
    iget v8, v1, Landroid/graphics/Rect;->top:I

    iget v9, v2, Landroid/graphics/Rect;->top:I

    if-le v8, v9, :cond_41

    iput v8, v2, Landroid/graphics/Rect;->top:I

    :cond_41
    iget v8, v1, Landroid/graphics/Rect;->right:I

    iget v9, v2, Landroid/graphics/Rect;->right:I

    if-le v8, v9, :cond_49

    iput v8, v2, Landroid/graphics/Rect;->right:I

    :cond_49
    iget v8, v1, Landroid/graphics/Rect;->bottom:I

    iget v9, v2, Landroid/graphics/Rect;->bottom:I

    if-le v8, v9, :cond_51

    iput v8, v2, Landroid/graphics/Rect;->bottom:I

    :cond_51
    add-int/lit8 v7, v7, 0x1

    goto :goto_20

    :cond_54
    iput-boolean v3, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->いいにぽつ:Z

    iput-object v2, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぺふねづ〺:Landroid/graphics/Rect;

    goto :goto_5a

    :cond_59
    :goto_59
    move-object v2, v1

    :goto_5a
    if-eqz v2, :cond_70

    .line 2
    invoke-virtual {p1, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget v0, v2, Landroid/graphics/Rect;->left:I

    iget v1, v2, Landroid/graphics/Rect;->top:I

    or-int/2addr v0, v1

    iget v1, v2, Landroid/graphics/Rect;->bottom:I

    or-int/2addr v0, v1

    iget v1, v2, Landroid/graphics/Rect;->right:I

    or-int/2addr v0, v1

    if-eqz v0, :cond_6e

    const/4 v0, 0x1

    goto :goto_7d

    :cond_6e
    const/4 v0, 0x0

    goto :goto_7d

    :cond_70
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_79

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result v0

    goto :goto_7d

    :cond_79
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result v0

    .line 3
    :goto_7d
    iget-object v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget-boolean v1, v1, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->どぇぞほだ:Z

    if-eqz v1, :cond_8a

    .line 4
    invoke-static {p0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->せづっ〸ちね(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    if-ne v1, v3, :cond_8a

    goto :goto_8b

    :cond_8a
    const/4 v3, 0x0

    :goto_8b
    if-eqz v3, :cond_95

    .line 5
    iget v1, p1, Landroid/graphics/Rect;->left:I

    iget v2, p1, Landroid/graphics/Rect;->right:I

    iput v2, p1, Landroid/graphics/Rect;->left:I

    iput v1, p1, Landroid/graphics/Rect;->right:I

    :cond_95
    return v0
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    if-eqz v0, :cond_9

    const/4 v1, 0x0

    .line 1
    iput-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ざとぅぼこ〺:Z

    iput-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ごづごきえ:Z

    .line 2
    :cond_9
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_1a

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_1a

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1a
    return-void
.end method

.method public isAutoMirrored()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget-boolean v0, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->どぇぞほだ:Z

    return v0
.end method

.method public jumpToCurrentState()V
    .registers 8

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x1

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x1

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    iget-object v2, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_20

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    iget-boolean v2, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぁごぐすすぃ:Z

    if-eqz v2, :cond_20

    iget-object v2, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    iget v3, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:I

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :cond_20
    iget-wide v2, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->てぜきぽく:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2b

    iput-wide v4, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->てぜきぽく:J

    const/4 v0, 0x1

    :cond_2b
    iget-wide v2, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぺふねづ〺:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_34

    iput-wide v4, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぺふねづ〺:J

    goto :goto_35

    :cond_34
    move v1, v0

    :goto_35
    if-eqz v1, :cond_3a

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_3a
    return-void
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぺぁあねじ:Z

    if-nez v0, :cond_17

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-ne v0, p0, :cond_17

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ()Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->づざかべべ()V

    invoke-virtual {p0, v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->づざかべべ(Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぺぁあねじ:Z

    :cond_17
    return-object p0
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_7
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_e

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_e
    return-void
.end method

.method public onLayoutDirectionChanged(I)Z
    .registers 11

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    .line 1
    iget v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〳ぜぞぜべっ:I

    .line 2
    iget v2, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->〳ぜぞぜべっ:I

    iget-object v3, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぁごぐすすぃ:[Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_b
    if-ge v5, v2, :cond_25

    aget-object v7, v3, v5

    if-eqz v7, :cond_22

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x17

    if-lt v7, v8, :cond_1e

    aget-object v7, v3, v5

    invoke-virtual {v7, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    move-result v7

    goto :goto_1f

    :cond_1e
    const/4 v7, 0x0

    :goto_1f
    if-ne v5, v1, :cond_22

    move v6, v7

    :cond_22
    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    :cond_25
    iput p1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぇ〳〲〺すっ:I

    return v6
.end method

.method public onLevelChange(I)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1

    :cond_9
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_12

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1

    :cond_12
    const/4 p1, 0x0

    return p1
.end method

.method public onStateChange([I)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    return p1

    :cond_9
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_12

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    return p1

    :cond_12
    const/4 p1, 0x0

    return p1
.end method

.method public scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_11

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_11

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    invoke-interface {p1, p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    :cond_11
    return-void
.end method

.method public setAlpha(I)V
    .registers 8

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぁごぐすすぃ:Z

    if-eqz v0, :cond_8

    iget v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:I

    if-eq v0, p1, :cond_21

    :cond_8
    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぁごぐすすぃ:Z

    iput p1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:I

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_21

    iget-wide v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぺふねづ〺:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_1d

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_21

    :cond_1d
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ(Z)V

    :cond_21
    :goto_21
    return-void
.end method

.method public setAutoMirrored(Z)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->どぇぞほだ:Z

    if-eq v1, p1, :cond_f

    iput-boolean p1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->どぇぞほだ:Z

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_f

    invoke-static {v0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->はつきどっ(Landroid/graphics/drawable/Drawable;Z)V

    :cond_f
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->じぜこほぱ:Z

    iget-object v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぅみぱぎぎ:Landroid/graphics/ColorFilter;

    if-eq v1, p1, :cond_12

    iput-object p1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぅみぱぎぎ:Landroid/graphics/ColorFilter;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_12

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_12
    return-void
.end method

.method public setDither(Z)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->〻ぞまぎな〻:Z

    if-eq v1, p1, :cond_f

    iput-boolean p1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->〻ぞまぎな〻:Z

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_f

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    :cond_f
    return-void
.end method

.method public setHotspot(FF)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_7

    invoke-static {v0, p1, p2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->のびぶけせ(Landroid/graphics/drawable/Drawable;FF)V

    :cond_7
    return-void
.end method

.method public setHotspotBounds(IIII)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Landroid/graphics/Rect;

    if-nez v0, :cond_c

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Landroid/graphics/Rect;

    goto :goto_f

    :cond_c
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    :goto_f
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_16

    invoke-static {v0, p1, p2, p3, p4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぇいうげ〱〹(Landroid/graphics/drawable/Drawable;IIII)V

    :cond_16
    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->せづっ〸ちね:Z

    iget-object v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぺづげぺが:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_10

    iput-object p1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぺづげぺが:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_10
    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぷぞてのほき:Z

    iget-object v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぉひのべい:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, p1, :cond_10

    iput-object p1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぉひのべい:Landroid/graphics/PorterDuff$Mode;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->しげにけぃ(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_10
    return-void
.end method

.method public setVisible(ZZ)Z
    .registers 5

    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result v0

    iget-object v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_b

    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_b
    iget-object v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_12

    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_12
    return v0
.end method

.method public unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_11

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_11

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    invoke-interface {p1, p0, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    :cond_11
    return-void
.end method

.method public 〺つふすそ()Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;
    .registers 1

    const p0, 0x0

    throw p0
.end method

.method public final くし〴〺ぅ(Landroid/graphics/drawable/Drawable;)V
    .registers 7

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->のぷのちつ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    if-nez v0, :cond_b

    new-instance v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    invoke-direct {v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;-><init>()V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->のぷのちつ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    :cond_b
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->のぷのちつ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v1

    .line 1
    iput-object v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    const/4 v0, 0x0

    :try_start_17
    iget-object v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget v1, v1, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->びえぁぜい:I

    if-gtz v1, :cond_26

    iget-boolean v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぁごぐすすぃ:Z

    if-eqz v1, :cond_26

    iget v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:I

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :cond_26
    iget-object v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget-boolean v2, v1, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->じぜこほぱ:Z

    if-eqz v2, :cond_32

    iget-object v1, v1, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぅみぱぎぎ:Landroid/graphics/ColorFilter;

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_46

    :cond_32
    iget-boolean v2, v1, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->せづっ〸ちね:Z

    if-eqz v2, :cond_3b

    iget-object v1, v1, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぺづげぺが:Landroid/content/res/ColorStateList;

    invoke-static {p1, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_3b
    iget-object v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget-boolean v2, v1, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぷぞてのほき:Z

    if-eqz v2, :cond_46

    iget-object v1, v1, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->ぉひのべい:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->しげにけぃ(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_46
    :goto_46
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    iget-object v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget-boolean v1, v1, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->〻ぞまぎな〻:Z

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_77

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    :cond_77
    const/16 v2, 0x13

    if-lt v1, v2, :cond_82

    iget-object v2, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget-boolean v2, v2, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->どぇぞほだ:Z

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    :cond_82
    iget-object v2, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Landroid/graphics/Rect;

    const/16 v3, 0x15

    if-lt v1, v3, :cond_95

    if-eqz v2, :cond_95

    iget v1, v2, Landroid/graphics/Rect;->left:I

    iget v3, v2, Landroid/graphics/Rect;->top:I

    iget v4, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, v1, v3, v4, v2}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V
    :try_end_95
    .catchall {:try_start_17 .. :try_end_95} :catchall_9f

    :cond_95
    iget-object v1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->のぷのちつ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    .line 3
    iget-object v2, v1, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Landroid/graphics/drawable/Drawable$Callback;

    iput-object v0, v1, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Landroid/graphics/drawable/Drawable$Callback;

    .line 4
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    return-void

    :catchall_9f
    move-exception v1

    iget-object v2, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->のぷのちつ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    .line 5
    iget-object v3, v2, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Landroid/graphics/drawable/Drawable$Callback;

    iput-object v0, v2, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Landroid/graphics/drawable/Drawable$Callback;

    .line 6
    invoke-virtual {p1, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    throw v1
.end method

.method public げつ〴ぬぐ(Z)V
    .registers 15

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぁごぐすすぃ:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    const-wide/16 v4, 0xff

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    if-eqz v3, :cond_36

    iget-wide v9, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぺふねづ〺:J

    cmp-long v11, v9, v7

    if-eqz v11, :cond_38

    cmp-long v11, v9, v1

    if-gtz v11, :cond_20

    iget v9, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:I

    invoke-virtual {v3, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_36

    :cond_20
    sub-long/2addr v9, v1

    mul-long v9, v9, v4

    long-to-int v10, v9

    iget-object v9, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget v9, v9, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->びえぁぜい:I

    div-int/2addr v10, v9

    rsub-int v9, v10, 0xff

    iget v10, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:I

    mul-int v9, v9, v10

    div-int/lit16 v9, v9, 0xff

    invoke-virtual {v3, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    const/4 v3, 0x1

    goto :goto_39

    :cond_36
    :goto_36
    iput-wide v7, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぺふねづ〺:J

    :cond_38
    const/4 v3, 0x0

    :goto_39
    iget-object v9, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    if-eqz v9, :cond_61

    iget-wide v10, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->てぜきぽく:J

    cmp-long v12, v10, v7

    if-eqz v12, :cond_63

    cmp-long v12, v10, v1

    if-gtz v12, :cond_4e

    invoke-virtual {v9, v6, v6}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    goto :goto_61

    :cond_4e
    sub-long/2addr v10, v1

    mul-long v10, v10, v4

    long-to-int v3, v10

    iget-object v4, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget v4, v4, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->なぶひせが:I

    div-int/2addr v3, v4

    iget v4, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:I

    mul-int v3, v3, v4

    div-int/lit16 v3, v3, 0xff

    invoke-virtual {v9, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_64

    :cond_61
    :goto_61
    iput-wide v7, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->てぜきぽく:J

    :cond_63
    move v0, v3

    :goto_64
    if-eqz p1, :cond_70

    if-eqz v0, :cond_70

    iget-object p1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->いいにぽつ:Ljava/lang/Runnable;

    const-wide/16 v3, 0x10

    add-long/2addr v1, v3

    invoke-virtual {p0, p1, v1, v2}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    :cond_70
    return-void
.end method

.method public づざかべべ(Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;)V
    .registers 2

    const p0, 0x0

    throw p0
.end method

.method public びぐびあび(I)Z
    .registers 11

    iget v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〳ぜぞぜべっ:I

    const/4 v1, 0x0

    if-ne p1, v0, :cond_6

    return v1

    :cond_6
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget v0, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->なぶひせが:I

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    if-lez v0, :cond_2e

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1a

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_1a
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_29

    iput-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget v0, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->なぶひせが:I

    int-to-long v0, v0

    add-long/2addr v0, v2

    iput-wide v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->てぜきぽく:J

    goto :goto_35

    :cond_29
    iput-object v4, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/graphics/drawable/Drawable;

    iput-wide v5, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->てぜきぽく:J

    goto :goto_35

    :cond_2e
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_35

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_35
    :goto_35
    if-ltz p1, :cond_55

    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget v1, v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->〳ぜぞぜべっ:I

    if-ge p1, v1, :cond_55

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->びぐびあび(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    iput p1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〳ぜぞぜべっ:I

    if-eqz v0, :cond_5a

    iget-object p1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget p1, p1, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;->びえぁぜい:I

    if-lez p1, :cond_51

    int-to-long v7, p1

    add-long/2addr v2, v7

    iput-wide v2, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぺふねづ〺:J

    :cond_51
    invoke-virtual {p0, v0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ(Landroid/graphics/drawable/Drawable;)V

    goto :goto_5a

    :cond_55
    iput-object v4, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/graphics/drawable/Drawable;

    const/4 p1, -0x1

    iput p1, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->〳ぜぞぜべっ:I

    :cond_5a
    :goto_5a
    iget-wide v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->ぺふねづ〺:J

    const/4 p1, 0x1

    cmp-long v2, v0, v5

    if-nez v2, :cond_67

    iget-wide v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->てぜきぽく:J

    cmp-long v2, v0, v5

    if-eqz v2, :cond_79

    :cond_67
    iget-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->いいにぽつ:Ljava/lang/Runnable;

    if-nez v0, :cond_73

    new-instance v0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->いいにぽつ:Ljava/lang/Runnable;

    goto :goto_76

    :cond_73
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    :goto_76
    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/のぷのちつ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ(Z)V

    :cond_79
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return p1
.end method
