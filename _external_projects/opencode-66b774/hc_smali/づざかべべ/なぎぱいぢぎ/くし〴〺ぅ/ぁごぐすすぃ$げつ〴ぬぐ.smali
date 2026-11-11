.class public Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u3041\u3054\u3050\u3059\u3059\u3043$\u303a\u3064\u3075\u3059\u305d;",
            ">;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V
    .registers 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p2

    sget-object v0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->State:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_1c
    if-ge v1, v0, :cond_56

    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    sget v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->State_android_id:I

    if-ne v2, v3, :cond_2f

    iget v3, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    goto :goto_53

    :cond_2f
    sget v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->State_constraints:I

    if-ne v2, v3, :cond_53

    iget v3, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v3, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    iget v4, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    const-string v3, "layout"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    :cond_53
    :goto_53
    add-int/lit8 v1, v1, 0x1

    goto :goto_1c

    :cond_56
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(FF)I
    .registers 5

    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1b

    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$〺つふすそ;

    invoke-virtual {v1, p1, p2}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$〺つふすそ;->げつ〴ぬぐ(FF)Z

    move-result v1

    if-eqz v1, :cond_18

    return v0

    :cond_18
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1b
    const/4 p1, -0x1

    return p1
.end method
