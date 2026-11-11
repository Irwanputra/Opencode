.class public Lcom/google/android/material/button/MaterialButton;
.super Landroidx/appcompat/widget/AppCompatButton;
.source ""

# interfaces
.implements Landroid/widget/Checkable;
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/ぇぬぎばつ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/button/MaterialButton$SavedState;,
        Lcom/google/android/material/button/MaterialButton$〺つふすそ;,
        Lcom/google/android/material/button/MaterialButton$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final ぇぬぎばつ:[I

.field public static final ぉざぅち〻:[I

.field public static final ざとぅぼこ〺:I


# instance fields
.field public 〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

.field public ぁごぐすすぃ:Landroid/graphics/PorterDuff$Mode;

.field public いいにぽつ:I

.field public おぐぴう〸ず:I

.field public final づざかべべ:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Lcom/google/android/material/button/MaterialButton$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public てぜきぽく:I

.field public なぎぱいぢぎ:Lcom/google/android/material/button/MaterialButton$〺つふすそ;

.field public のぷのちつ:Z

.field public final びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

.field public へぬ〴づぞ:Z

.field public ぺぁあねじ:Landroid/graphics/drawable/Drawable;

.field public ぺふねづ〺:I


# direct methods
.method public static constructor <clinit>()V
    .registers 4

    const/4 v0, 0x1

    new-array v1, v0, [I

    const v2, 0x101009f

    const/4 v3, 0x0

    aput v2, v1, v3

    sput-object v1, Lcom/google/android/material/button/MaterialButton;->ぇぬぎばつ:[I

    new-array v0, v0, [I

    const v1, 0x10100a0

    aput v1, v0, v3

    sput-object v0, Lcom/google/android/material/button/MaterialButton;->ぉざぅち〻:[I

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺふねづ〺;->Widget_MaterialComponents_Button:I

    sput v0, Lcom/google/android/material/button/MaterialButton;->ざとぅぼこ〺:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/button/MaterialButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->materialButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/button/MaterialButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 25

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    move/from16 v8, p3

    sget v9, Lcom/google/android/material/button/MaterialButton;->ざとぅぼこ〺:I

    move-object/from16 v1, p1

    invoke-static {v1, v7, v8, v9}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v7, v8}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v1, v0, Lcom/google/android/material/button/MaterialButton;->づざかべべ:Ljava/util/LinkedHashSet;

    const/4 v10, 0x0

    iput-boolean v10, v0, Lcom/google/android/material/button/MaterialButton;->のぷのちつ:Z

    iput-boolean v10, v0, Lcom/google/android/material/button/MaterialButton;->へぬ〴づぞ:Z

    invoke-virtual/range {p0 .. p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v11

    sget-object v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton:[I

    new-array v6, v10, [I

    move-object v1, v11

    move-object/from16 v2, p2

    move/from16 v4, p3

    move v5, v9

    invoke-static/range {v1 .. v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->びぐびあび(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_iconPadding:I

    invoke-virtual {v1, v2, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/button/MaterialButton;->てぜきぽく:I

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_iconTintMode:I

    const/4 v3, -0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v2, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〱かけばぜぐ(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/material/button/MaterialButton;->ぁごぐすすぃ:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual/range {p0 .. p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_iconTint:I

    invoke-static {v2, v1, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/material/button/MaterialButton;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    invoke-virtual/range {p0 .. p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_icon:I

    invoke-static {v2, v1, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->じぜこほぱ(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_iconGravity:I

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/button/MaterialButton;->おぐぴう〸ず:I

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_iconSize:I

    invoke-virtual {v1, v2, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/button/MaterialButton;->いいにぽつ:I

    .line 1
    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/げつ〴ぬぐ;

    int-to-float v5, v10

    invoke-direct {v2, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/げつ〴ぬぐ;-><init>(F)V

    invoke-static {v11, v7, v8, v9, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;->〺つふすそ(Landroid/content/Context;Landroid/util/AttributeSet;IILなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/くし〴〺ぅ;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;

    move-result-object v2

    .line 2
    invoke-virtual {v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;->げつ〴ぬぐ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    move-result-object v2

    new-instance v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    invoke-direct {v5, v0, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;-><init>(Lcom/google/android/material/button/MaterialButton;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V

    iput-object v5, v0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 3
    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_android_insetLeft:I

    invoke-virtual {v1, v2, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->くし〴〺ぅ:I

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_android_insetRight:I

    invoke-virtual {v1, v2, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->びぐびあび:I

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_android_insetTop:I

    invoke-virtual {v1, v2, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->づざかべべ:I

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_android_insetBottom:I

    invoke-virtual {v1, v2, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_cornerRadius:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_be

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぁごぐすすぃ:I

    iget-object v6, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    int-to-float v2, v2

    invoke-virtual {v6, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;->づざかべべ(F)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    move-result-object v2

    invoke-virtual {v5, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->づざかべべ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V

    iput-boolean v4, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぇぬぎばつ:Z

    :cond_be
    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_strokeWidth:I

    invoke-virtual {v1, v2, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〳ぜぞぜべっ:I

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_backgroundTintMode:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    sget-object v6, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v2, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〱かけばぜぐ(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    iput-object v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    iget-object v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v2}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_backgroundTint:I

    invoke-static {v2, v1, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    iput-object v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->いいにぽつ:Landroid/content/res/ColorStateList;

    iget-object v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v2}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_strokeColor:I

    invoke-static {v2, v1, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    iput-object v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺふねづ〺:Landroid/content/res/ColorStateList;

    iget-object v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v2}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_rippleColor:I

    invoke-static {v2, v1, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    iput-object v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->てぜきぽく:Landroid/content/res/ColorStateList;

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_android_checkable:I

    invoke-virtual {v1, v2, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぉざぅち〻:Z

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_elevation:I

    invoke-virtual {v1, v2, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iget-object v6, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    invoke-static {v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->は〲ぱなで(Landroid/view/View;)I

    move-result v6

    iget-object v7, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v7}, Landroid/widget/Button;->getPaddingTop()I

    move-result v7

    iget-object v8, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    invoke-static {v8}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ざとぅぼこ〺(Landroid/view/View;)I

    move-result v8

    iget-object v9, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v9}, Landroid/widget/Button;->getPaddingBottom()I

    move-result v9

    sget v11, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->MaterialButton_android_background:I

    invoke-virtual {v1, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v11

    if-eqz v11, :cond_140

    .line 4
    iput-boolean v4, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->おぐぴう〸ず:Z

    iget-object v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    iget-object v3, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->いいにぽつ:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v3}, Lcom/google/android/material/button/MaterialButton;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    iget-object v3, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, v3}, Lcom/google/android/material/button/MaterialButton;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    const/4 v4, 0x0

    const/4 v10, 0x1

    goto/16 :goto_216

    .line 5
    :cond_140
    iget-object v11, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    .line 6
    new-instance v12, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    iget-object v13, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    invoke-direct {v12, v13}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V

    iget-object v13, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v13}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v13

    invoke-virtual {v12, v13}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ぉざぅち〻(Landroid/content/Context;)V

    iget-object v13, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->いいにぽつ:Landroid/content/res/ColorStateList;

    invoke-static {v12, v13}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    iget-object v13, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    if-eqz v13, :cond_15e

    invoke-static {v12, v13}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->しげにけぃ(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_15e
    iget v13, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〳ぜぞぜべっ:I

    int-to-float v13, v13

    iget-object v14, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺふねづ〺:Landroid/content/res/ColorStateList;

    invoke-virtual {v12, v13, v14}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->びえぁぜい(FLandroid/content/res/ColorStateList;)V

    new-instance v13, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    iget-object v14, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    invoke-direct {v13, v14}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V

    invoke-virtual {v13, v10}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->setTint(I)V

    iget v14, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〳ぜぞぜべっ:I

    int-to-float v14, v14

    iget-boolean v15, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->へぬ〴づぞ:Z

    if-eqz v15, :cond_180

    iget-object v15, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    sget v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->colorSurface:I

    invoke-static {v15, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぶでにく〼〳(Landroid/view/View;I)I

    move-result v4

    goto :goto_181

    :cond_180
    const/4 v4, 0x0

    :goto_181
    invoke-virtual {v13, v14, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ぇ〳〲〺すっ(FI)V

    sget-boolean v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->は〲ぱなで:Z

    const/4 v14, 0x2

    if-eqz v4, :cond_1cb

    new-instance v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    iget-object v15, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    invoke-direct {v4, v15}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V

    iput-object v4, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->のぷのちつ:Landroid/graphics/drawable/Drawable;

    invoke-static {v4, v3}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->せだてはぺて(Landroid/graphics/drawable/Drawable;I)V

    new-instance v3, Landroid/graphics/drawable/RippleDrawable;

    iget-object v4, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->てぜきぽく:Landroid/content/res/ColorStateList;

    invoke-static {v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/じぜこほぱ/〺つふすそ;->くし〴〺ぅ(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v4

    new-instance v15, Landroid/graphics/drawable/LayerDrawable;

    new-array v14, v14, [Landroid/graphics/drawable/Drawable;

    aput-object v13, v14, v10

    const/4 v13, 0x1

    aput-object v12, v14, v13

    invoke-direct {v15, v14}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 7
    new-instance v12, Landroid/graphics/drawable/InsetDrawable;

    iget v13, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->くし〴〺ぅ:I

    iget v14, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->づざかべべ:I

    iget v10, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->びぐびあび:I

    iget v0, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    move-object/from16 v16, v15

    move-object v15, v12

    move/from16 v17, v13

    move/from16 v18, v14

    move/from16 v19, v10

    move/from16 v20, v0

    invoke-direct/range {v15 .. v20}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 8
    iget-object v0, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->のぷのちつ:Landroid/graphics/drawable/Drawable;

    invoke-direct {v3, v4, v12, v0}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iput-object v3, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ざとぅぼこ〺:Landroid/graphics/drawable/LayerDrawable;

    const/4 v4, 0x0

    const/4 v10, 0x1

    goto :goto_209

    :cond_1cb
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/じぜこほぱ/げつ〴ぬぐ;

    iget-object v3, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    invoke-direct {v0, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/じぜこほぱ/げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V

    iput-object v0, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->のぷのちつ:Landroid/graphics/drawable/Drawable;

    iget-object v3, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->てぜきぽく:Landroid/content/res/ColorStateList;

    invoke-static {v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/じぜこほぱ/〺つふすそ;->くし〴〺ぅ(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-static {v0, v3}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    const/4 v3, 0x3

    new-array v3, v3, [Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    aput-object v13, v3, v4

    const/4 v10, 0x1

    aput-object v12, v3, v10

    iget-object v12, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->のぷのちつ:Landroid/graphics/drawable/Drawable;

    aput-object v12, v3, v14

    invoke-direct {v0, v3}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v0, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ざとぅぼこ〺:Landroid/graphics/drawable/LayerDrawable;

    .line 9
    new-instance v3, Landroid/graphics/drawable/InsetDrawable;

    iget v12, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->くし〴〺ぅ:I

    iget v13, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->づざかべべ:I

    iget v14, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->びぐびあび:I

    iget v15, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    move/from16 v20, v15

    move-object v15, v3

    move-object/from16 v16, v0

    move/from16 v17, v12

    move/from16 v18, v13

    move/from16 v19, v14

    invoke-direct/range {v15 .. v20}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 10
    :goto_209
    invoke-virtual {v11, v3}, Lcom/google/android/material/button/MaterialButton;->setInternalBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    move-result-object v0

    if-eqz v0, :cond_216

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->は〲ぱなで(F)V

    :cond_216
    :goto_216
    iget-object v0, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    iget v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->くし〴〺ぅ:I

    add-int/2addr v6, v2

    iget v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->づざかべべ:I

    add-int/2addr v7, v2

    iget v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->びぐびあび:I

    add-int/2addr v8, v2

    iget v2, v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    add-int/2addr v9, v2

    invoke-static {v0, v6, v7, v8, v9}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->えがぐせほち(Landroid/view/View;IIII)V

    .line 11
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    move-object/from16 v0, p0

    iget v1, v0, Lcom/google/android/material/button/MaterialButton;->てぜきぽく:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setCompoundDrawablePadding(I)V

    iget-object v1, v0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_236

    goto :goto_237

    :cond_236
    const/4 v10, 0x0

    :goto_237
    invoke-virtual {v0, v10}, Lcom/google/android/material/button/MaterialButton;->くし〴〺ぅ(Z)V

    return-void
.end method

.method private getA11yClassName()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->げつ〴ぬぐ()Z

    move-result v0

    if-eqz v0, :cond_9

    const-class v0, Landroid/widget/CompoundButton;

    goto :goto_b

    :cond_9
    const-class v0, Landroid/widget/Button;

    :goto_b
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getBackgroundTintList()Landroid/content/res/ColorStateList;
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->getSupportBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getCornerRadius()I
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぁごぐすすぃ:I

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    return v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getIconGravity()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/button/MaterialButton;->おぐぴう〸ず:I

    return v0
.end method

.method public getIconPadding()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/button/MaterialButton;->てぜきぽく:I

    return v0
.end method

.method public getIconSize()I
    .registers 2

    iget v0, p0, Lcom/google/android/material/button/MaterialButton;->いいにぽつ:I

    return v0
.end method

.method public getIconTint()Landroid/content/res/ColorStateList;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getIconTintMode()Landroid/graphics/PorterDuff$Mode;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->ぁごぐすすぃ:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public getRippleColor()Landroid/content/res/ColorStateList;
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->てぜきぽく:Landroid/content/res/ColorStateList;

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    return-object v0
.end method

.method public getShapeAppearanceModel()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    return-object v0

    .line 2
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getStrokeColor()Landroid/content/res/ColorStateList;
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺふねづ〺:Landroid/content/res/ColorStateList;

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    return-object v0
.end method

.method public getStrokeWidth()I
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iget v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〳ぜぞぜべっ:I

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    return v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->いいにぽつ:Landroid/content/res/ColorStateList;

    return-object v0

    .line 2
    :cond_b
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatButton;->getSupportBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    return-object v0

    .line 2
    :cond_b
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatButton;->getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public isChecked()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/material/button/MaterialButton;->のぷのちつ:Z

    return v0
.end method

.method public onAttachedToWindow()V
    .registers 2

    invoke-super {p0}, Landroid/widget/Button;->onAttachedToWindow()V

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    move-result-object v0

    invoke-static {p0, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅばづそほせ(Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;)V

    :cond_12
    return-void
.end method

.method public onCreateDrawableState(I)[I
    .registers 3

    add-int/lit8 p1, p1, 0x2

    invoke-super {p0, p1}, Landroid/widget/Button;->onCreateDrawableState(I)[I

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->げつ〴ぬぐ()Z

    move-result v0

    if-eqz v0, :cond_11

    sget-object v0, Lcom/google/android/material/button/MaterialButton;->ぇぬぎばつ:[I

    invoke-static {p1, v0}, Landroid/widget/Button;->mergeDrawableStates([I[I)[I

    :cond_11
    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1c

    sget-object v0, Lcom/google/android/material/button/MaterialButton;->ぉざぅち〻:[I

    invoke-static {p1, v0}, Landroid/widget/Button;->mergeDrawableStates([I[I)[I

    :cond_1c
    return-object p1
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-direct {p0}, Lcom/google/android/material/button/MaterialButton;->getA11yClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->isChecked()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setChecked(Z)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 3

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-direct {p0}, Lcom/google/android/material/button/MaterialButton;->getA11yClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->げつ〴ぬぐ()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->isChecked()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    invoke-virtual {p0}, Landroid/widget/Button;->isClickable()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 8

    invoke-super/range {p0 .. p5}, Landroidx/appcompat/widget/AppCompatButton;->onLayout(ZIIII)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x15

    if-ne p1, v0, :cond_20

    iget-object p1, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    if-eqz p1, :cond_20

    sub-int/2addr p5, p3

    sub-int/2addr p4, p2

    .line 1
    iget-object p2, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->のぷのちつ:Landroid/graphics/drawable/Drawable;

    if-eqz p2, :cond_20

    iget p3, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->くし〴〺ぅ:I

    iget v0, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->づざかべべ:I

    iget v1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->びぐびあび:I

    sub-int/2addr p4, v1

    iget p1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    sub-int/2addr p5, p1

    invoke-virtual {p2, p3, v0, p4, p5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_20
    return-void
.end method

.method public onMeasure(II)V
    .registers 3

    invoke-super {p0, p1, p2}, Landroid/widget/Button;->onMeasure(II)V

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->びぐびあび()V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    instance-of v0, p1, Lcom/google/android/material/button/MaterialButton$SavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroid/widget/Button;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Lcom/google/android/material/button/MaterialButton$SavedState;

    .line 1
    iget-object v0, p1, Landroidx/customview/view/AbsSavedState;->〺つふすそ:Landroid/os/Parcelable;

    .line 2
    invoke-super {p0, v0}, Landroid/widget/Button;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-boolean p1, p1, Lcom/google/android/material/button/MaterialButton$SavedState;->びぐびあび:Z

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->setChecked(Z)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    invoke-super {p0}, Landroid/widget/Button;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/google/android/material/button/MaterialButton$SavedState;

    invoke-direct {v1, v0}, Lcom/google/android/material/button/MaterialButton$SavedState;-><init>(Landroid/os/Parcelable;)V

    iget-boolean v0, p0, Lcom/google/android/material/button/MaterialButton;->のぷのちつ:Z

    iput-boolean v0, v1, Lcom/google/android/material/button/MaterialButton$SavedState;->びぐびあび:Z

    return-object v1
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .registers 5

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/AppCompatButton;->onTextChanged(Ljava/lang/CharSequence;III)V

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->びぐびあび()V

    return-void
.end method

.method public performClick()Z
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->toggle()V

    invoke-super {p0}, Landroid/widget/Button;->performClick()Z

    move-result v0

    return v0
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setBackgroundColor(I)V
    .registers 4

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    move-result-object v1

    if-eqz v1, :cond_19

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    move-result-object v0

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->setTint(I)V

    goto :goto_19

    .line 2
    :cond_16
    invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    :cond_19
    :goto_19
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 5

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_2c

    invoke-virtual {p0}, Landroid/widget/Button;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eq p1, v0, :cond_20

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    const/4 v1, 0x1

    .line 1
    iput-boolean v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->おぐぴう〸ず:Z

    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    iget-object v2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->いいにぽつ:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v2}, Lcom/google/android/material/button/MaterialButton;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v0}, Lcom/google/android/material/button/MaterialButton;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_2c

    .line 2
    :cond_20
    invoke-virtual {p0}, Landroid/widget/Button;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_2f

    :cond_2c
    :goto_2c
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_2f
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 3

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 2

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 2

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setCheckable(Z)V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iput-boolean p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぉざぅち〻:Z

    :cond_a
    return-void
.end method

.method public setChecked(Z)V
    .registers 4

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->げつ〴ぬぐ()Z

    move-result v0

    if-eqz v0, :cond_38

    invoke-virtual {p0}, Landroid/widget/Button;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_38

    iget-boolean v0, p0, Lcom/google/android/material/button/MaterialButton;->のぷのちつ:Z

    if-eq v0, p1, :cond_38

    iput-boolean p1, p0, Lcom/google/android/material/button/MaterialButton;->のぷのちつ:Z

    invoke-virtual {p0}, Landroid/widget/Button;->refreshDrawableState()V

    iget-boolean p1, p0, Lcom/google/android/material/button/MaterialButton;->へぬ〴づぞ:Z

    if-eqz p1, :cond_1a

    return-void

    :cond_1a
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/material/button/MaterialButton;->へぬ〴づぞ:Z

    iget-object p1, p0, Lcom/google/android/material/button/MaterialButton;->づざかべべ:Ljava/util/LinkedHashSet;

    invoke-virtual {p1}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_23
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_35

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/button/MaterialButton$げつ〴ぬぐ;

    iget-boolean v1, p0, Lcom/google/android/material/button/MaterialButton;->のぷのちつ:Z

    invoke-interface {v0, p0, v1}, Lcom/google/android/material/button/MaterialButton$げつ〴ぬぐ;->げつ〴ぬぐ(Lcom/google/android/material/button/MaterialButton;Z)V

    goto :goto_23

    :cond_35
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/material/button/MaterialButton;->へぬ〴づぞ:Z

    :cond_38
    return-void
.end method

.method public setCornerRadius(I)V
    .registers 4

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_1f

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iget-boolean v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぇぬぎばつ:Z

    if-eqz v1, :cond_10

    iget v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぁごぐすすぃ:I

    if-eq v1, p1, :cond_1f

    :cond_10
    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぁごぐすすぃ:I

    const/4 v1, 0x1

    iput-boolean v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぇぬぎばつ:Z

    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    int-to-float p1, p1

    invoke-virtual {v1, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;->づざかべべ(F)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    move-result-object p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->づざかべべ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V

    :cond_1f
    return-void
.end method

.method public setCornerRadiusResource(I)V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Landroid/widget/Button;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->setCornerRadius(I)V

    :cond_11
    return-void
.end method

.method public setElevation(F)V
    .registers 5

    invoke-super {p0, p1}, Landroid/widget/Button;->setElevation(F)V

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    move-result-object v0

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iget v2, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->おぐぴう〸ず:F

    cmpl-float v2, v2, p1

    if-eqz v2, :cond_1c

    iput p1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->おぐぴう〸ず:F

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ぺづげぺが()V

    :cond_1c
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_a

    iput-object p1, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->くし〴〺ぅ(Z)V

    :cond_a
    return-void
.end method

.method public setIconGravity(I)V
    .registers 3

    iget v0, p0, Lcom/google/android/material/button/MaterialButton;->おぐぴう〸ず:I

    if-eq v0, p1, :cond_9

    iput p1, p0, Lcom/google/android/material/button/MaterialButton;->おぐぴう〸ず:I

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->びぐびあび()V

    :cond_9
    return-void
.end method

.method public setIconPadding(I)V
    .registers 3

    iget v0, p0, Lcom/google/android/material/button/MaterialButton;->てぜきぽく:I

    if-eq v0, p1, :cond_9

    iput p1, p0, Lcom/google/android/material/button/MaterialButton;->てぜきぽく:I

    invoke-virtual {p0, p1}, Landroid/widget/Button;->setCompoundDrawablePadding(I)V

    :cond_9
    return-void
.end method

.method public setIconResource(I)V
    .registers 3

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->setIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setIconSize(I)V
    .registers 3

    if-ltz p1, :cond_d

    iget v0, p0, Lcom/google/android/material/button/MaterialButton;->いいにぽつ:I

    if-eq v0, p1, :cond_c

    iput p1, p0, Lcom/google/android/material/button/MaterialButton;->いいにぽつ:I

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->くし〴〺ぅ(Z)V

    :cond_c
    return-void

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "iconSize cannot be less than 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setIconTint(Landroid/content/res/ColorStateList;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_a

    iput-object p1, p0, Lcom/google/android/material/button/MaterialButton;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->くし〴〺ぅ(Z)V

    :cond_a
    return-void
.end method

.method public setIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->ぁごぐすすぃ:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, p1, :cond_a

    iput-object p1, p0, Lcom/google/android/material/button/MaterialButton;->ぁごぐすすぃ:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->くし〴〺ぅ(Z)V

    :cond_a
    return-void
.end method

.method public setIconTintResource(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->setIconTint(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setInternalBackground(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setOnPressedChangeListenerInternal(Lcom/google/android/material/button/MaterialButton$〺つふすそ;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/button/MaterialButton;->なぎぱいぢぎ:Lcom/google/android/material/button/MaterialButton$〺つふすそ;

    return-void
.end method

.method public setPressed(Z)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->なぎぱいぢぎ:Lcom/google/android/material/button/MaterialButton$〺つふすそ;

    if-eqz v0, :cond_b

    check-cast v0, Lcom/google/android/material/button/MaterialButtonToggleGroup$なぎぱいぢぎ;

    .line 1
    iget-object v0, v0, Lcom/google/android/material/button/MaterialButtonToggleGroup$なぎぱいぢぎ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButtonToggleGroup;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->invalidate()V

    .line 2
    :cond_b
    invoke-super {p0, p1}, Landroid/widget/Button;->setPressed(Z)V

    return-void
.end method

.method public setRippleColor(Landroid/content/res/ColorStateList;)V
    .registers 5

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_47

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->てぜきぽく:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_47

    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->てぜきぽく:Landroid/content/res/ColorStateList;

    sget-boolean v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->は〲ぱなで:Z

    if-eqz v1, :cond_2c

    iget-object v2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v2}, Landroid/widget/Button;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    instance-of v2, v2, Landroid/graphics/drawable/RippleDrawable;

    if-eqz v2, :cond_2c

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v0}, Landroid/widget/Button;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/じぜこほぱ/〺つふすそ;->くし〴〺ぅ(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    goto :goto_47

    :cond_2c
    if-nez v1, :cond_47

    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v1}, Landroid/widget/Button;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    instance-of v1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/じぜこほぱ/げつ〴ぬぐ;

    if-eqz v1, :cond_47

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v0}, Landroid/widget/Button;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/じぜこほぱ/げつ〴ぬぐ;

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/じぜこほぱ/〺つふすそ;->くし〴〺ぅ(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/じぜこほぱ/げつ〴ぬぐ;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_47
    :goto_47
    return-void
.end method

.method public setRippleColorResource(I)V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->setRippleColor(Landroid/content/res/ColorStateList;)V

    :cond_11
    return-void
.end method

.method public setShapeAppearanceModel(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->づざかべべ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V

    return-void

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setShouldDrawSurfaceColorStroke(Z)V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iput-boolean p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->へぬ〴づぞ:Z

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->なぎぱいぢぎ()V

    :cond_d
    return-void
.end method

.method public setStrokeColor(Landroid/content/res/ColorStateList;)V
    .registers 4

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺふねづ〺:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_11

    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺふねづ〺:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->なぎぱいぢぎ()V

    :cond_11
    return-void
.end method

.method public setStrokeColorResource(I)V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/〺つふすそ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->setStrokeColor(Landroid/content/res/ColorStateList;)V

    :cond_11
    return-void
.end method

.method public setStrokeWidth(I)V
    .registers 4

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iget v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〳ぜぞぜべっ:I

    if-eq v1, p1, :cond_11

    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〳ぜぞぜべっ:I

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->なぎぱいぢぎ()V

    :cond_11
    return-void
.end method

.method public setStrokeWidthResource(I)V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Landroid/widget/Button;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/button/MaterialButton;->setStrokeWidth(I)V

    :cond_11
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .registers 4

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->いいにぽつ:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_21

    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->いいにぽつ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    move-result-object p1

    if-eqz p1, :cond_21

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    move-result-object p1

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->いいにぽつ:Landroid/content/res/ColorStateList;

    invoke-static {p1, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    goto :goto_21

    .line 2
    :cond_1e
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_21
    :goto_21
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .registers 4

    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_22

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, p1, :cond_25

    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    move-result-object p1

    if-eqz p1, :cond_25

    iget-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_25

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->〺つふすそ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    move-result-object p1

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぺぁあねじ:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->しげにけぃ(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_25

    .line 2
    :cond_22
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_25
    :goto_25
    return-void
.end method

.method public toggle()V
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/material/button/MaterialButton;->のぷのちつ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/material/button/MaterialButton;->setChecked(Z)V

    return-void
.end method

.method public final 〺つふすそ()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    if-eqz v0, :cond_a

    .line 1
    iget-boolean v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->おぐぴう〸ず:Z

    if-nez v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    return v0
.end method

.method public final くし〴〺ぅ(Z)V
    .registers 8

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_3b

    invoke-static {v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〱〴なぱへて(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lcom/google/android/material/button/MaterialButton;->〳ぜぞぜべっ:Landroid/content/res/ColorStateList;

    invoke-static {v0, v2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->がぐくいおす(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->ぁごぐすすぃ:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_1d

    iget-object v2, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    invoke-static {v2, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->しげにけぃ(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_1d
    iget v0, p0, Lcom/google/android/material/button/MaterialButton;->いいにぽつ:I

    if-eqz v0, :cond_22

    goto :goto_28

    :cond_22
    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    :goto_28
    iget v2, p0, Lcom/google/android/material/button/MaterialButton;->いいにぽつ:I

    if-eqz v2, :cond_2d

    goto :goto_33

    :cond_2d
    iget-object v2, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    :goto_33
    iget-object v3, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    iget v4, p0, Lcom/google/android/material/button/MaterialButton;->ぺふねづ〺:I

    add-int/2addr v0, v4

    invoke-virtual {v3, v4, v1, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_3b
    iget v0, p0, Lcom/google/android/material/button/MaterialButton;->おぐぴう〸ず:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_46

    if-ne v0, v2, :cond_44

    goto :goto_46

    :cond_44
    const/4 v0, 0x0

    goto :goto_47

    :cond_46
    :goto_46
    const/4 v0, 0x1

    :goto_47
    const/4 v4, 0x0

    if-eqz p1, :cond_56

    .line 1
    iget-object p1, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_52

    invoke-static {p0, p1, v4, v4, v4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぎきぁ〱ぢ(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_55

    :cond_52
    invoke-static {p0, v4, v4, p1, v4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぎきぁ〱ぢ(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :goto_55
    return-void

    .line 2
    :cond_56
    invoke-static {p0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぉひのべい(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object p1

    aget-object v5, p1, v1

    aget-object p1, p1, v2

    if-eqz v0, :cond_64

    iget-object v2, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    if-ne v5, v2, :cond_6a

    :cond_64
    if-nez v0, :cond_6b

    iget-object v2, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    if-eq p1, v2, :cond_6b

    :cond_6a
    const/4 v1, 0x1

    :cond_6b
    if-eqz v1, :cond_78

    .line 3
    iget-object p1, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_75

    invoke-static {p0, p1, v4, v4, v4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぎきぁ〱ぢ(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_78

    :cond_75
    invoke-static {p0, v4, v4, p1, v4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぎきぁ〱ぢ(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_78
    :goto_78
    return-void
.end method

.method public げつ〴ぬぐ()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;

    if-eqz v0, :cond_a

    .line 1
    iget-boolean v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ごづごきえ/げつ〴ぬぐ;->ぉざぅち〻:Z

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    return v0
.end method

.method public final びぐびあび()V
    .registers 7

    iget-object v0, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_86

    invoke-virtual {p0}, Landroid/widget/Button;->getLayout()Landroid/text/Layout;

    move-result-object v0

    if-nez v0, :cond_c

    goto/16 :goto_86

    :cond_c
    iget v0, p0, Lcom/google/android/material/button/MaterialButton;->おぐぴう〸ず:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_81

    const/4 v3, 0x3

    if-ne v0, v3, :cond_16

    goto :goto_81

    :cond_16
    invoke-virtual {p0}, Landroid/widget/Button;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {p0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Landroid/widget/Button;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v4

    if-eqz v4, :cond_34

    invoke-virtual {p0}, Landroid/widget/Button;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v4

    invoke-interface {v4, v3, p0}, Landroid/text/method/TransformationMethod;->getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_34
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0}, Landroid/widget/Button;->getLayout()Landroid/text/Layout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/text/Layout;->getEllipsizedWidth()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v3, p0, Lcom/google/android/material/button/MaterialButton;->いいにぽつ:I

    if-nez v3, :cond_4f

    iget-object v3, p0, Lcom/google/android/material/button/MaterialButton;->ぺぁあねじ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    :cond_4f
    invoke-virtual {p0}, Landroid/widget/Button;->getMeasuredWidth()I

    move-result v4

    sub-int/2addr v4, v0

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ざとぅぼこ〺(Landroid/view/View;)I

    move-result v0

    sub-int/2addr v4, v0

    sub-int/2addr v4, v3

    iget v0, p0, Lcom/google/android/material/button/MaterialButton;->てぜきぽく:I

    sub-int/2addr v4, v0

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->は〲ぱなで(Landroid/view/View;)I

    move-result v0

    sub-int/2addr v4, v0

    div-int/lit8 v4, v4, 0x2

    .line 1
    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v0

    if-ne v0, v1, :cond_6c

    const/4 v0, 0x1

    goto :goto_6d

    :cond_6c
    const/4 v0, 0x0

    .line 2
    :goto_6d
    iget v3, p0, Lcom/google/android/material/button/MaterialButton;->おぐぴう〸ず:I

    const/4 v5, 0x4

    if-ne v3, v5, :cond_73

    goto :goto_74

    :cond_73
    const/4 v1, 0x0

    :goto_74
    if-eq v0, v1, :cond_77

    neg-int v4, v4

    :cond_77
    iget v0, p0, Lcom/google/android/material/button/MaterialButton;->ぺふねづ〺:I

    if-eq v0, v4, :cond_80

    iput v4, p0, Lcom/google/android/material/button/MaterialButton;->ぺふねづ〺:I

    invoke-virtual {p0, v2}, Lcom/google/android/material/button/MaterialButton;->くし〴〺ぅ(Z)V

    :cond_80
    return-void

    :cond_81
    :goto_81
    iput v2, p0, Lcom/google/android/material/button/MaterialButton;->ぺふねづ〺:I

    invoke-virtual {p0, v2}, Lcom/google/android/material/button/MaterialButton;->くし〴〺ぅ(Z)V

    :cond_86
    :goto_86
    return-void
.end method
