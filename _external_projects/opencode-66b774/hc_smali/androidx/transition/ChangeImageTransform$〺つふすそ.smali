.class public final Landroidx/transition/ChangeImageTransform$〺つふすそ;
.super Landroid/util/Property;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeImageTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Landroid/widget/ImageView;",
        "Landroid/graphics/Matrix;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, Landroid/widget/ImageView;

    const/4 p1, 0x0

    return-object p1
.end method

.method public set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 7

    check-cast p1, Landroid/widget/ImageView;

    check-cast p2, Landroid/graphics/Matrix;

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_f

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->animateTransform(Landroid/graphics/Matrix;)V

    goto/16 :goto_8f

    :cond_f
    const/4 v1, 0x0

    if-nez p2, :cond_38

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_8f

    invoke-virtual {p1}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/ImageView;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p1}, Landroid/widget/ImageView;->getPaddingRight()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p1}, Landroid/widget/ImageView;->getHeight()I

    move-result v2

    invoke-virtual {p1}, Landroid/widget/ImageView;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p1}, Landroid/widget/ImageView;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p2, v1, v1, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_8c

    :cond_38
    const/16 v2, 0x15

    if-lt v0, v2, :cond_47

    .line 2
    sget-boolean v0, Lづざかべべ/は〲ぱなで/ぺふねづ〺;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_8f

    :try_start_40
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->animateTransform(Landroid/graphics/Matrix;)V
    :try_end_43
    .catch Ljava/lang/NoSuchMethodError; {:try_start_40 .. :try_end_43} :catch_44

    goto :goto_8f

    :catch_44
    sput-boolean v1, Lづざかべべ/は〲ぱなで/ぺふねづ〺;->げつ〴ぬぐ:Z

    goto :goto_8f

    .line 3
    :cond_47
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_8f

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    invoke-virtual {v0, v1, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    const/4 v0, 0x0

    .line 4
    sget-boolean v1, Lづざかべべ/は〲ぱなで/ぺふねづ〺;->くし〴〺ぅ:Z

    if-nez v1, :cond_6d

    const/4 v1, 0x1

    :try_start_5e
    const-class v2, Landroid/widget/ImageView;

    const-string v3, "mDrawMatrix"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Lづざかべべ/は〲ぱなで/ぺふねづ〺;->〺つふすそ:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_6b
    .catch Ljava/lang/NoSuchFieldException; {:try_start_5e .. :try_end_6b} :catch_6b

    :catch_6b
    sput-boolean v1, Lづざかべべ/は〲ぱなで/ぺふねづ〺;->くし〴〺ぅ:Z

    .line 5
    :cond_6d
    sget-object v1, Lづざかべべ/は〲ぱなで/ぺふねづ〺;->〺つふすそ:Ljava/lang/reflect/Field;

    if-eqz v1, :cond_87

    :try_start_71
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Matrix;
    :try_end_77
    .catch Ljava/lang/IllegalAccessException; {:try_start_71 .. :try_end_77} :catch_84

    if-nez v1, :cond_86

    :try_start_79
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V
    :try_end_7e
    .catch Ljava/lang/IllegalAccessException; {:try_start_79 .. :try_end_7e} :catch_86

    :try_start_7e
    sget-object v1, Lづざかべべ/は〲ぱなで/ぺふねづ〺;->〺つふすそ:Ljava/lang/reflect/Field;

    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_83
    .catch Ljava/lang/IllegalAccessException; {:try_start_7e .. :try_end_83} :catch_84

    goto :goto_87

    :catch_84
    nop

    goto :goto_87

    :catch_86
    :cond_86
    move-object v0, v1

    :cond_87
    :goto_87
    if-eqz v0, :cond_8c

    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    :cond_8c
    :goto_8c
    invoke-virtual {p1}, Landroid/widget/ImageView;->invalidate()V

    :cond_8f
    :goto_8f
    return-void
.end method
