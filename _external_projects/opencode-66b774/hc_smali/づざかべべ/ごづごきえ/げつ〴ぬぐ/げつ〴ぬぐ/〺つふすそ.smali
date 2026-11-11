.class public Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;
.super Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;
.source ""

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;,
        Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;
    }
.end annotation


# instance fields
.field public くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

.field public づざかべべ:Landroid/animation/ArgbEvaluator;

.field public final なぎぱいぢぎ:Landroid/graphics/drawable/Drawable$Callback;

.field public びぐびあび:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0, v0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;-><init>(Landroid/content/Context;Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;Landroid/content/res/Resources;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;Landroid/content/res/Resources;)V
    .registers 4

    invoke-direct {p0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;-><init>()V

    const/4 p2, 0x0

    iput-object p2, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/animation/ArgbEvaluator;

    new-instance p3, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {p3, p0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;-><init>(Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;)V

    iput-object p3, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:Landroid/graphics/drawable/Drawable$Callback;

    iput-object p1, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/content/Context;

    new-instance p1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    invoke-direct {p1, p2, p3, p2}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;-><init>(Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;Landroid/graphics/drawable/Drawable$Callback;Landroid/content/res/Resources;)V

    iput-object p1, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    return-void
.end method


# virtual methods
.method public applyTheme(Landroid/content/res/Resources$Theme;)V
    .registers 5

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_d

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_d

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->applyTheme(Landroid/content/res/Resources$Theme;)V

    :cond_d
    return-void
.end method

.method public canApplyTheme()Z
    .registers 4

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_f

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_f

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z

    move-result v0

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    :goto_10
    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    :cond_8
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0, p1}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->draw(Landroid/graphics/Canvas;)V

    iget-object p1, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object p1, p1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->isStarted()Z

    move-result p1

    if-eqz p1, :cond_1c

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_1c
    return-void
.end method

.method public getAlpha()I
    .registers 4

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_11

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_f

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    move-result v0

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    :goto_10
    return v0

    .line 2
    :cond_11
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->getAlpha()I

    move-result v0

    return v0
.end method

.method public getChangingConfigurations()I
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    return v0

    :cond_9
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    iget-object v1, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget v1, v1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->げつ〴ぬぐ:I

    or-int/2addr v0, v1

    return v0
.end method

.method public getColorFilter()Landroid/graphics/ColorFilter;
    .registers 4

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_11

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_f

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    :goto_10
    return-object v0

    .line 2
    :cond_11
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_16

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_16

    new-instance v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;

    iget-object v1, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    invoke-direct {v0, v1}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$くし〴〺ぅ;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    return-object v0

    :cond_16
    const/4 v0, 0x0

    return-object v0
.end method

.method public getIntrinsicHeight()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0

    :cond_9
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->getIntrinsicHeight()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0

    :cond_9
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->getIntrinsicWidth()I

    move-result v0

    return v0
.end method

.method public getOpacity()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    return v0

    :cond_9
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->getOpacity()I

    move-result v0

    return v0
.end method

.method public inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V
    .registers 5

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .registers 27

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    iget-object v5, v1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    const/16 v6, 0x15

    if-eqz v5, :cond_1c

    .line 1
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v7, v6, :cond_18

    invoke-virtual {v5, v0, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    goto :goto_1b

    :cond_18
    invoke-virtual {v5, v0, v2, v3}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V

    :goto_1b
    return-void

    .line 2
    :cond_1c
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v5

    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v7

    const/4 v8, 0x1

    add-int/2addr v7, v8

    :goto_26
    if-eq v5, v8, :cond_19e

    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v9

    if-ge v9, v7, :cond_31

    const/4 v9, 0x3

    if-eq v5, v9, :cond_19e

    :cond_31
    const/4 v9, 0x2

    if-ne v5, v9, :cond_193

    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v10, "animated-vector"

    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    const/16 v11, 0x18

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v10, :cond_ae

    sget-object v5, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:[I

    invoke-static {v0, v4, v3, v5}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぺぁあねじ(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v5

    invoke-virtual {v5, v13, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v10

    if-eqz v10, :cond_a9

    .line 3
    sget-object v14, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぺふねづ〺:Landroid/graphics/PorterDuff$Mode;

    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v14, v11, :cond_74

    new-instance v9, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-direct {v9}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;-><init>()V

    if-lt v14, v6, :cond_62

    .line 4
    invoke-virtual {v0, v10, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    goto :goto_66

    :cond_62
    invoke-virtual {v0, v10}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    .line 5
    :goto_66
    iput-object v10, v9, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    new-instance v10, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ$ぺぁあねじ;

    iget-object v11, v9, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v11}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v11

    invoke-direct {v10, v11}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ$ぺぁあねじ;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    goto :goto_95

    :cond_74
    :try_start_74
    invoke-virtual {v0, v10}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v10

    invoke-static {v10}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v11

    :goto_7c
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v14

    if-eq v14, v9, :cond_85

    if-eq v14, v8, :cond_85

    goto :goto_7c

    :cond_85
    if-ne v14, v9, :cond_8c

    invoke-static {v0, v10, v11, v4}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->げつ〴ぬぐ(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    move-result-object v9

    goto :goto_95

    :cond_8c
    new-instance v9, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v10, "No start tag found"

    invoke-direct {v9, v10}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v9
    :try_end_94
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_74 .. :try_end_94} :catch_94
    .catch Ljava/io/IOException; {:try_start_74 .. :try_end_94} :catch_94

    :catch_94
    move-object v9, v12

    .line 6
    :goto_95
    iput-boolean v13, v9, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぁごぐすすぃ:Z

    .line 7
    iget-object v10, v1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->なぎぱいぢぎ:Landroid/graphics/drawable/Drawable$Callback;

    invoke-virtual {v9, v10}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    iget-object v10, v1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v10, v10, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    if-eqz v10, :cond_a5

    invoke-virtual {v10, v12}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_a5
    iget-object v10, v1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iput-object v9, v10, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    :cond_a9
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    goto/16 :goto_193

    :cond_ae
    const-string v9, "target"

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_193

    sget-object v5, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:[I

    invoke-virtual {v0, v3, v5}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v5

    invoke-virtual {v5, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v8, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v10

    if-eqz v10, :cond_18d

    iget-object v13, v1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:Landroid/content/Context;

    if-eqz v13, :cond_182

    .line 8
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v15, v11, :cond_d4

    invoke-static {v13, v10}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object v10

    move v6, v15

    goto :goto_f7

    :cond_d4
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v13}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v11

    const-string v8, "Can\'t load animation resource ID #0x"

    .line 9
    :try_start_de
    invoke-virtual {v14, v10}, Landroid/content/res/Resources;->getAnimation(I)Landroid/content/res/XmlResourceParser;

    move-result-object v21
    :try_end_e2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_de .. :try_end_e2} :catch_15d
    .catch Ljava/io/IOException; {:try_start_de .. :try_end_e2} :catch_140
    .catchall {:try_start_de .. :try_end_e2} :catchall_13e

    .line 10
    :try_start_e2
    invoke-static/range {v21 .. v21}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/high16 v20, 0x3f800000    # 1.0f

    move v6, v15

    move-object v15, v11

    move-object/from16 v16, v21

    invoke-static/range {v13 .. v20}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;IF)Landroid/animation/Animator;

    move-result-object v10
    :try_end_f4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_e2 .. :try_end_f4} :catch_13a
    .catch Ljava/io/IOException; {:try_start_e2 .. :try_end_f4} :catch_136
    .catchall {:try_start_e2 .. :try_end_f4} :catchall_134

    .line 11
    invoke-interface/range {v21 .. v21}, Landroid/content/res/XmlResourceParser;->close()V

    .line 12
    :goto_f7
    iget-object v8, v1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v8, v8, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    .line 13
    iget-object v8, v8, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ$〳ぜぞぜべっ;

    iget-object v8, v8, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ$〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ$ぁごぐすすぃ;

    iget-object v8, v8, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ$ぁごぐすすぃ;->ぇぬぎばつ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    .line 14
    invoke-virtual {v8, v9, v12}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 15
    invoke-virtual {v10, v8}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    const/16 v8, 0x15

    if-ge v6, v8, :cond_10f

    invoke-virtual {v1, v10}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ(Landroid/animation/Animator;)V

    :cond_10f
    iget-object v6, v1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v11, v6, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/ArrayList;

    if-nez v11, :cond_125

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v6, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/ArrayList;

    iget-object v6, v1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    new-instance v11, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {v11}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;-><init>()V

    iput-object v11, v6, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->づざかべべ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    :cond_125
    iget-object v6, v1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v6, v6, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/ArrayList;

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, v1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v6, v6, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->づざかべべ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v6, v10, v9}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_18f

    :catchall_134
    move-exception v0

    goto :goto_17c

    :catch_136
    move-exception v0

    move-object/from16 v12, v21

    goto :goto_141

    :catch_13a
    move-exception v0

    move-object/from16 v12, v21

    goto :goto_15e

    :catchall_13e
    move-exception v0

    goto :goto_17a

    :catch_140
    move-exception v0

    .line 16
    :goto_141
    :try_start_141
    new-instance v2, Landroid/content/res/Resources$NotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v2

    :catch_15d
    move-exception v0

    :goto_15e
    new-instance v2, Landroid/content/res/Resources$NotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v2
    :try_end_17a
    .catchall {:try_start_141 .. :try_end_17a} :catchall_13e

    :goto_17a
    move-object/from16 v21, v12

    :goto_17c
    if-eqz v21, :cond_181

    invoke-interface/range {v21 .. v21}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_181
    throw v0

    .line 17
    :cond_182
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Context can\'t be null when inflating animators"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18d
    const/16 v8, 0x15

    :goto_18f
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_195

    :cond_193
    :goto_193
    const/16 v8, 0x15

    :goto_195
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    const/16 v6, 0x15

    const/4 v8, 0x1

    goto/16 :goto_26

    :cond_19e
    iget-object v0, v1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    .line 18
    iget-object v2, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    if-nez v2, :cond_1ab

    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v2, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    :cond_1ab
    iget-object v2, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    return-void
.end method

.method public isAutoMirrored()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-static {v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->こ〲しでおか(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    return v0

    :cond_9
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->isAutoMirrored()Z

    move-result v0

    return v0
.end method

.method public isRunning()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_b

    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->isRunning()Z

    move-result v0

    return v0

    :cond_b
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v0

    return v0
.end method

.method public isStateful()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    return v0

    :cond_9
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->isStateful()Z

    move-result v0

    return v0
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    :cond_7
    return-object p0
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void

    :cond_8
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onLevelChange(I)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1

    :cond_9
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1
.end method

.method public onStateChange([I)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    return p1

    :cond_9
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0, p1}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->setState([I)Z

    move-result p1

    return p1
.end method

.method public setAlpha(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void

    :cond_8
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0, p1}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->setAlpha(I)V

    return-void
.end method

.method public setAutoMirrored(Z)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    invoke-static {v0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->はつきどっ(Landroid/graphics/drawable/Drawable;Z)V

    return-void

    :cond_8
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    .line 1
    iget-object v1, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_14

    invoke-static {v1, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->はつきどっ(Landroid/graphics/drawable/Drawable;Z)V

    goto :goto_18

    :cond_14
    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ$〳ぜぞぜべっ;

    iput-boolean p1, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ$〳ぜぞぜべっ;->づざかべべ:Z

    :goto_18
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    :cond_8
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    .line 1
    iget-object v1, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_14

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_19

    :cond_14
    iput-object p1, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:Landroid/graphics/ColorFilter;

    invoke-virtual {v0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->invalidateSelf()V

    :goto_19
    return-void
.end method

.method public setTint(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    invoke-static {v0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->せだてはぺて(Landroid/graphics/drawable/Drawable;I)V

    return-void

    :cond_8
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0, p1}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->setTint(I)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    invoke-static {v0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void

    :cond_8
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0, p1}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_8

    invoke-static {v0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->しげにけぃ(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    return-void

    :cond_8
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0, p1}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setVisible(ZZ)Z
    .registers 4

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1

    :cond_9
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->setVisible(ZZ)Z

    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1
.end method

.method public start()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_a

    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->start()V

    return-void

    :cond_a
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isStarted()Z

    move-result v0

    if-eqz v0, :cond_15

    return-void

    :cond_15
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public stop()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_a

    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->stop()V

    return-void

    :cond_a
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;

    iget-object v0, v0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->end()V

    return-void
.end method

.method public final げつ〴ぬぐ(Landroid/animation/Animator;)V
    .registers 5

    instance-of v0, p1, Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_20

    move-object v0, p1

    check-cast v0, Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->getChildAnimations()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_20

    const/4 v1, 0x0

    :goto_e
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    invoke-virtual {p0, v2}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ(Landroid/animation/Animator;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    :cond_20
    instance-of v0, p1, Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_4a

    check-cast p1, Landroid/animation/ObjectAnimator;

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->getPropertyName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "fillColor"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3a

    const-string v1, "strokeColor"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4a

    :cond_3a
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/animation/ArgbEvaluator;

    if-nez v0, :cond_45

    new-instance v0, Landroid/animation/ArgbEvaluator;

    invoke-direct {v0}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/animation/ArgbEvaluator;

    :cond_45
    iget-object v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->づざかべべ:Landroid/animation/ArgbEvaluator;

    invoke-virtual {p1, v0}, Landroid/animation/ObjectAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    :cond_4a
    return-void
.end method
