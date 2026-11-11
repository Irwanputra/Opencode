.class public final Landroidx/fragment/app/BackStackState;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/fragment/app/BackStackState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final 〳ぜぞぜべっ:Ljava/lang/String;

.field public final 〺つふすそ:[I

.field public final ぁごぐすすぃ:I

.field public final いいにぽつ:I

.field public final ぇぬぎばつ:Z

.field public final おぐぴう〸ず:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final づざかべべ:[I

.field public final てぜきぽく:I

.field public final なぎぱいぢぎ:I

.field public final のぷのちつ:Ljava/lang/CharSequence;

.field public final びぐびあび:[I

.field public final へぬ〴づぞ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final ぺぁあねじ:I

.field public final ぺふねづ〺:Ljava/lang/CharSequence;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Landroidx/fragment/app/BackStackState$げつ〴ぬぐ;

    invoke-direct {v0}, Landroidx/fragment/app/BackStackState$げつ〴ぬぐ;-><init>()V

    sput-object v0, Landroidx/fragment/app/BackStackState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->〺つふすそ:[I

    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->びぐびあび:[I

    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->づざかべべ:[I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/BackStackState;->なぎぱいぢぎ:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/BackStackState;->ぁごぐすすぃ:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->〳ぜぞぜべっ:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/BackStackState;->ぺぁあねじ:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/BackStackState;->いいにぽつ:I

    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->ぺふねづ〺:Ljava/lang/CharSequence;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/BackStackState;->てぜきぽく:I

    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->のぷのちつ:Ljava/lang/CharSequence;

    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->へぬ〴づぞ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->おぐぴう〸ず:Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_67

    const/4 p1, 0x1

    goto :goto_68

    :cond_67
    const/4 p1, 0x0

    :goto_68
    iput-boolean p1, p0, Landroidx/fragment/app/BackStackState;->ぇぬぎばつ:Z

    return-void
.end method

.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;)V
    .registers 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v1, v0, 0x5

    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/fragment/app/BackStackState;->〺つふすそ:[I

    iget-boolean v1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〳ぜぞぜべっ:Z

    if-eqz v1, :cond_a2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Landroidx/fragment/app/BackStackState;->くし〴〺ぅ:Ljava/util/ArrayList;

    new-array v1, v0, [I

    iput-object v1, p0, Landroidx/fragment/app/BackStackState;->びぐびあび:[I

    new-array v1, v0, [I

    iput-object v1, p0, Landroidx/fragment/app/BackStackState;->づざかべべ:[I

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_24
    if-ge v1, v0, :cond_75

    iget-object v3, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;

    iget-object v4, p0, Landroidx/fragment/app/BackStackState;->〺つふすそ:[I

    add-int/lit8 v5, v2, 0x1

    iget v6, v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    aput v6, v4, v2

    iget-object v2, p0, Landroidx/fragment/app/BackStackState;->くし〴〺ぅ:Ljava/util/ArrayList;

    iget-object v4, v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->〺つふすそ:Landroidx/fragment/app/Fragment;

    if-eqz v4, :cond_3f

    iget-object v4, v4, Landroidx/fragment/app/Fragment;->なぎぱいぢぎ:Ljava/lang/String;

    goto :goto_40

    :cond_3f
    const/4 v4, 0x0

    :goto_40
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Landroidx/fragment/app/BackStackState;->〺つふすそ:[I

    add-int/lit8 v4, v5, 0x1

    iget v6, v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->くし〴〺ぅ:I

    aput v6, v2, v5

    add-int/lit8 v5, v4, 0x1

    iget v6, v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->びぐびあび:I

    aput v6, v2, v4

    add-int/lit8 v4, v5, 0x1

    iget v6, v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->づざかべべ:I

    aput v6, v2, v5

    add-int/lit8 v5, v4, 0x1

    iget v6, v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->なぎぱいぢぎ:I

    aput v6, v2, v4

    iget-object v2, p0, Landroidx/fragment/app/BackStackState;->びぐびあび:[I

    iget-object v4, v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v4, v2, v1

    iget-object v2, p0, Landroidx/fragment/app/BackStackState;->づざかべべ:[I

    iget-object v3, v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->〳ぜぞぜべっ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    move v2, v5

    goto :goto_24

    :cond_75
    iget v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->なぎぱいぢぎ:I

    iput v0, p0, Landroidx/fragment/app/BackStackState;->なぎぱいぢぎ:I

    iget v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぁごぐすすぃ:I

    iput v0, p0, Landroidx/fragment/app/BackStackState;->ぁごぐすすぃ:I

    iget-object v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぺぁあねじ:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->〳ぜぞぜべっ:Ljava/lang/String;

    iget v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->は〲ぱなで:I

    iput v0, p0, Landroidx/fragment/app/BackStackState;->ぺぁあねじ:I

    iget v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->いいにぽつ:I

    iput v0, p0, Landroidx/fragment/app/BackStackState;->いいにぽつ:I

    iget-object v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぺふねづ〺:Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->ぺふねづ〺:Ljava/lang/CharSequence;

    iget v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->てぜきぽく:I

    iput v0, p0, Landroidx/fragment/app/BackStackState;->てぜきぽく:I

    iget-object v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->のぷのちつ:Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->のぷのちつ:Ljava/lang/CharSequence;

    iget-object v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->へぬ〴づぞ:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->へぬ〴づぞ:Ljava/util/ArrayList;

    iget-object v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->おぐぴう〸ず:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/fragment/app/BackStackState;->おぐぴう〸ず:Ljava/util/ArrayList;

    iget-boolean p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぇぬぎばつ:Z

    iput-boolean p1, p0, Landroidx/fragment/app/BackStackState;->ぇぬぎばつ:Z

    return-void

    :cond_a2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not on back stack"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_ab

    :goto_aa
    throw p1

    :goto_ab
    goto :goto_aa
.end method


# virtual methods
.method public describeContents()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    iget-object p2, p0, Landroidx/fragment/app/BackStackState;->〺つふすそ:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    iget-object p2, p0, Landroidx/fragment/app/BackStackState;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Landroidx/fragment/app/BackStackState;->びぐびあび:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    iget-object p2, p0, Landroidx/fragment/app/BackStackState;->づざかべべ:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    iget p2, p0, Landroidx/fragment/app/BackStackState;->なぎぱいぢぎ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/fragment/app/BackStackState;->ぁごぐすすぃ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/fragment/app/BackStackState;->〳ぜぞぜべっ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Landroidx/fragment/app/BackStackState;->ぺぁあねじ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/fragment/app/BackStackState;->いいにぽつ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/fragment/app/BackStackState;->ぺふねづ〺:Ljava/lang/CharSequence;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    iget p2, p0, Landroidx/fragment/app/BackStackState;->てぜきぽく:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/fragment/app/BackStackState;->のぷのちつ:Ljava/lang/CharSequence;

    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    iget-object p2, p0, Landroidx/fragment/app/BackStackState;->へぬ〴づぞ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Landroidx/fragment/app/BackStackState;->おぐぴう〸ず:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-boolean p2, p0, Landroidx/fragment/app/BackStackState;->ぇぬぎばつ:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
